package site;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface IConnection {

	default public Connection connectToDataBase() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/9gag";
		return DriverManager.getConnection(url, "root", "1234");
	}
}
