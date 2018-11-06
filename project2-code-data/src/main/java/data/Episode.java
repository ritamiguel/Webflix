package data;

public class Episode {

	private int title;
	private String sinopse;
	
	public Episode(int title, String sinopse) {
		this.title = title;
		this.sinopse = sinopse;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}	
}
