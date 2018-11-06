package data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Content implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private long id;
	private String title;
	private String director;
	private Date year;
	private String category;
	
	@OneToMany
	private List <User> subscribers;
	
	
	public Content(String title, String director, Date year, String category) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.category = category;
	}
	
	public Content() {}
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
}
