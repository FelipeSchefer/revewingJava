package viewer;

public class Student extends Person{

	private String login;
	private int totalWatched;
	
	public Student(String name, int age, String sex, String login) {
		super(name, age, sex);
		this.login = login;
		this.totalWatched = 0;
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalWatched() {
		return totalWatched;
	}

	public void setTotalWatched(int totalWatched) {
		this.totalWatched = totalWatched;
	}

	@Override
	public String toString() {
		return "Student: [ "
				+ super.toString()
				+ "\n login = " + login 
				+ ",\n total watched = " + totalWatched 
				+ "\n]"
				+ "\n--------------------------------------\n";
	}
	
	

}
