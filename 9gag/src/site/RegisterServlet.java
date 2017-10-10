package site;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RegisterServlet")

public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection connection;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		try {
			connection = connectToDataBase();
			
			write(email, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection connectToDataBase() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/9gag";
	    return  DriverManager.getConnection(url, "root", "1234");
	}
	
	public void write(String email, String password){
		String query = "INSERT INTO 9gag.profiles (email, password) values (?, ?)";
		try {
			PreparedStatement prep = connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setString(1, email);
			prep.setString(2, password);
			prep.execute();
			connectToDataBase().close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
