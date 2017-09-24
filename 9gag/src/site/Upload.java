package site;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Upload {

	String description;
	File file;
	Date date;
	int likes;
	
	public Upload(String description,int likes) {
		super();
		this.description = description;
		this.likes = likes;
	}

	public Connection connectToDataBase() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/9gag";
	    return  DriverManager.getConnection(url, "root", "1234");
	}
	
	public void write(String description, int likes){
		String query = "insert upload to the database";
		try {
			PreparedStatement prep = connectToDataBase().prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setString(1, description);
			prep.setInt(2, likes);
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
	public Date getDate() {
		return date;
	}
	
}
