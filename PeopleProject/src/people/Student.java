package people;

public class Student extends People {
	private int enroll;
	private String course;
	
	public void unsubscribe() {
		System.out.print("Enroll is cancelled. \n");
		this.setCourse("empty");
	}
	
	public void payTuition() {
		System.out.println("Student: "+ this.getName() +" is paying the tuition. \n");
	}

	public int getEnroll() {
		return enroll;
	}

	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student:["
				 + "\n name = " + this.getName() 
			     + ",\n age = " + this.getAge() 
			     + ",\n sex = " + this.getSex() 
				 + ",\n enroll = " + getEnroll()
				 + ",\n course = " + getCourse()
				 + "\n ] \n--------------------------------------";
	}
	
	
	
}
