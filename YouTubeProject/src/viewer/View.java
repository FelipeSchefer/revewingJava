package viewer;

import youtube.Video;

public class View {

	private Student spectator;
	private Video film;
	
	public View(Student spectator, Video film) {
		super();
		this.spectator = spectator;
		this.film = film;
		this.spectator.setTotalWatched(this.spectator.getTotalWatched() + 1);
		this.film.setViews(this.film.getViews() + 1);
	}
	
	public void estimate() {
		this.film.setEvaluation(5);
	}

	public void estimate(int score) {
		this.film.setEvaluation(score);
	}
	
	public void estimate(float percentage) {
		int tot = 0;
		if(percentage <= 20) {
			tot = 3;
		}
		else if(percentage <= 50) {
			tot = 5;
		}
		else if(percentage <= 90) {
			tot = 8;
		}
		else {
			tot = 10;
		}
		this.film.setEvaluation(tot);
		
	}
	

	public Student getSpectator() {
		return spectator;
	}

	public void setSpectator(Student spectator) {
		this.spectator = spectator;
	}

	public Video getFilm() {
		return film;
	}

	public void setFilm(Video film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "/#****************[-INICIO-]*****************#\\ \n\n"
				 + "View: [ "
				 + "\nspectator = " + spectator 
				 + "\nfilm = " + film 
				 + "\n]"
				 + "\n\\#*****************[-FIM-]*******************#/ \n";
	}
	
	
}
