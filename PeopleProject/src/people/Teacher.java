package people;

public class Teacher extends People {
	private String subject;
	private double salary;
	
	public void promotion(float promotion) {
		this.salary += promotion;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher:["
				 + "\n name = " + this.getName() 
			     + ",\n age = " + this.getAge() 
			     + ",\n sex = " + this.getSex() 
				 + ",\n subject = " + getSubject()
				 + ",\n salary = " + getSalary()
				 + "\n ] \n--------------------------------------";			
	}	
}
