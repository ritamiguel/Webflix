package data;

import java.util.Date;

public class Movie extends Content {
	
	private static final long serialVersionUID = 1L;

	public Movie(String title, String director, Date year, String category) {
		super(title, director, year, category);
	}	
}
