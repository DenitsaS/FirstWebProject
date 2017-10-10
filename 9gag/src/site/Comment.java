package site;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comment implements IString, IConnection, ILike {
	private LocalDateTime date;
	private Upload upload;
	private String text;
	private int votes;

	public Comment(LocalDateTime date, String text) {
		this.date = date;
		this.text = text;
		this.votes = 0;
	}

	public void setText(String text) {
		if (isStringValid(text)) {
			this.text = text;
		}
	}

	public void like() {
		this.votes++;
		
			String query ="UPDATE upload SET likes = ?";
			try {
				PreparedStatement prep = connectToDataBase().prepareStatement(query,
						PreparedStatement.RETURN_GENERATED_KEYS);
				prep.setInt(1, votes);
				prep.execute();
				connectToDataBase().close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	

	public void dislike() {
		this.votes--;
		String query ="UPDATE upload SET likes = ?";
		try {
			PreparedStatement prep = connectToDataBase().prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			prep.setInt(1, votes);
			prep.execute();
			connectToDataBase().close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
