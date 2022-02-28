package people;

public abstract class People {
	private String name;
	private int age;
	private String sex;
		
	public void birthday() {
		this.age++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "People:["
				 + "\n name=" + name 
			     + ",\n age=" + age 
			     + ",\n sex=" + sex 
				 + "]\n--------------------------------------";
	}
}