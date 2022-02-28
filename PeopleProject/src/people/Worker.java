package people;

public final class Worker extends People {
	private String section;
	private boolean working;
	
	public final void changingWork() {
		System.out.println("Not working \n");
		this.working = !this.working;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return "Worker:["
				 + "\n name = " + this.getName() 
			     + ",\n age = " + this.getAge() 
			     + ",\n sex = " + this.getSex() 
				 + ",\n section = " + getSection()
				 + ",\n working = " + isWorking()
				 + "\n ] \n--------------------------------------";
	}
}
