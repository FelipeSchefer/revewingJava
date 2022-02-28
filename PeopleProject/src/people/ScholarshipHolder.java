package people;

public final class ScholarshipHolder extends Student{

	private float scholarship;
	
	public void renewScholarship() {
		System.out.println("Student: " + this.getName() + " renewed the Scholarship \n");
	}
	
	@Override
	public void payTuition() {
		System.out.println("Student: "+ this.getName() +" is a scholarship holder the tuition is paid. \n");
	}

	public float getScholarship() {
		return scholarship;
	}

	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return "ScholarshipHolder: ["
					 + "\n name = " + this.getName() 
				     + ",\n age = " + this.getAge() 
				     + ",\n sex = " + this.getSex() 
					 + ",\n enroll = " + getEnroll()
					 + ",\n course = " + getCourse()
					 + ",\n Scholarship = " + getScholarship()
					 + "\n ] \n--------------------------------------";
	}
	
	
	

}
