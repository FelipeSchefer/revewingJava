package people;

public final class TechnicalStudent extends Student{

	private int professionalRegistration;
	
	public void practice() {
		System.out.println("You're practicing");
	}
	
	@Override
	public void payTuition() {
		System.out.println("Student: "+ this.getName() +" is a Tecnical Student. \n");
	}

	public int getProfessionalRegistration() {
		return professionalRegistration;
	}

	public void setProfessionalRegistration(int professionalRegistration) {
		this.professionalRegistration = professionalRegistration;
	}

	@Override
	public String toString() {
		return "TechnicalStudent: ["
				 + "\n name = " + this.getName() 
			     + ",\n age = " + this.getAge() 
			     + ",\n sex = " + this.getSex() 
				 + ",\n enroll = " + getEnroll()
				 + ",\n course = " + getCourse()
				 + ",\n Professional Registration =" + getProfessionalRegistration()
				 + "\n ] \n--------------------------------------";
	}
	
	
}
