package youtube;

public class Video implements YoutubeActions{
	
	private String title;
	private int evaluation;
	private int views;
	private int likes;
	private boolean reproducing;
	
	public Video(String title) {
		this.title = title;
		this.evaluation = 1;
		this.views = 0;
		this.likes = 0;
		this.reproducing = false;
	}

	@Override
	public void play() {
		this.reproducing = true;
	}

	@Override
	public void pause() {
		this.reproducing = false;
	}

	@Override
	public void like() {
		this.likes++;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		int newEvaluation;
		newEvaluation = (int) ((this.evaluation + evaluation)/this.views);
		this.evaluation = newEvaluation;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean getReproducing() {
		return reproducing;
	}

	public void setReproducing(boolean reproducing) {
		this.reproducing = reproducing;
	}

	@Override
	public String toString() {
		return "Video: [ "
				+ "\n title = " + title 
				+ ",\n evaluation = " + evaluation 
				+ ",\n views = " + views 
				+ ",\n likes = " + likes
				+ ",\n reproducing = " + reproducing 
				+ "\n]"
				+ "\n---------------------------------------\n";
	}
	
	
	
}