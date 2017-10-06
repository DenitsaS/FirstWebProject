package site;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comment implements IString {
	private LocalDateTime date;
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
	}

	public void disLike() {
		this.votes--;
	}
}
