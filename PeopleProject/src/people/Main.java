package people;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Felipe");
		s.setAge(28);
		s.setSex("Male");
		s.setCourse("IT");
		s.setEnroll(01);
//		s.unsubscribe();
		System.out.println(s.toString());
		
		Worker w = new Worker();
		w.setName("Schefer");
		w.setAge(28);
		w.setSex("Male");
		w.setSection("Dev");
		w.setWorking(true);
//		w.changingWork();
		System.out.println(w.toString());
		
		Teacher t = new Teacher();
		t.setName("Teixeira");
		t.setAge(28);
		t.setSex("Male");
		t.setSalary(10.000f);
//		t.promotion(5.000f);
		System.out.println(t.toString());
	}

}
