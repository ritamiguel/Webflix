package data;

import java.util.List;
import java.util.Date;

public class TVShow extends Content {
	
	private static final long serialVersionUID = 1L;
	private List<Episode> episodes; // seasons/ep

	public TVShow(String title, String director, Date year, String category) {
		super(title, director, year, category);
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
	public void addEpisode(int title, String sinopse) {
		episodes.add(new Episode(title, sinopse));
	}
}
