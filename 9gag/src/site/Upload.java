package site;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Upload implements IString {

	private int uploadID;
	private String description;
	private String filePath;
	private LocalDateTime date;
	private long userId;
	private boolean isSafeForWork;
	private Category category;
	private int likes;
	private int upVotes;
	private boolean isPublic;
	private Map<String, Integer> tags;
	private List<Comment> comments;

	public Upload(String description, String filePath, long userId, boolean isSafeForWork, Category category,
			boolean isPublic, Map<String, Integer> tags) {
		super();
		this.date = LocalDateTime.now();
		this.uploadID = 0;
		this.description = description;
		this.filePath = filePath;
		this.userId = userId;
		this.isSafeForWork = isSafeForWork;
		this.category = category;
		this.upVotes = 0;
		this.isPublic = isPublic;
		this.tags = tags;
		this.comments = new ArrayList<Comment>();
		write(description, filePath, userId, isSafeForWork, category, isPublic);
	}

	public void setDescription(String description) {
		if (isStringValid(description)) {
			this.description = description;
		}
	}

	public Connection connectToDataBase() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/9gag";
		return DriverManager.getConnection(url, "root", "1234");
	}

	public void write(String description, String filePath, long userId, boolean isSafeForWork, Category category,
			boolean isPublic) {
		String query = "INSERT INTO upload (description, filePath, userId, isSafeForWork, category, isPublic) values (?,?, ?, ? ,?, ?)";
		try {
			PreparedStatement prep = connectToDataBase().prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setString(1, description);
			prep.setString(2, filePath);
			prep.setFloat(3, userId);
			prep.setBoolean(4, isSafeForWork);
			prep.setString(5, category.toString());
			prep.setBoolean(6, isPublic);
			prep.execute();
			connectToDataBase().close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void like() {
		this.likes++;
		String query = "INSERT INTO upload (likes) values (?)";
		try {
			PreparedStatement prep = connectToDataBase().prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setInt(1, likes);
			prep.execute();
			connectToDataBase().close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disLike() {
		this.likes--;
		String query = "INSERT INTO upload (likes) values (?)";
		try {
			PreparedStatement prep = connectToDataBase().prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setInt(1, likes);
			prep.execute();
			connectToDataBase().close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
