package site;
import java.sql.*;
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Upload u = new Upload("азис", 5);
		u.write(u.description, u.likes);
	
		
	}
}
