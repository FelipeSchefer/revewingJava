package people;

public class Main {

	public static void main(String[] args) {
		
		Guest g = new Guest();
		g.setName("Felipe");
		g.setAge(28);
		g.setSex("Male");
		System.out.println(g.toString());
		
		Student s = new Student();
		s.setName("Felipe");
		s.setAge(28);
		s.setSex("Male");
		s.setCourse("IT");
		s.setEnroll(01);
//		s.unsubscribe();
		System.out.println(s.toString());
				
		Teacher t = new Teacher();
		t.setName("Teixeira");
		t.setAge(28);
		t.setSex("Male");
		t.setSalary(10.000f);
//		t.promotion(5.000f);
		System.out.println(t.toString());
		
		Worker w = new Worker();
		w.setName("Schefer");
		w.setAge(28);
		w.setSex("Male");
		w.setSection("Dev");
		w.setWorking(true);
//		w.changingWork();
		System.out.println(w.toString());
		
		ScholarshipHolder sh = new ScholarshipHolder();
		sh.setName("Fernanda");
		sh.setAge(28);
		sh.setSex("Female");
		sh.setCourse("air attendent");
		sh.setEnroll(02);
//		s.unsubscribe();
		sh.renewScholarship();
		sh.setScholarship(200);
		sh.payTuition();
		System.out.println(sh.toString());
		
		TechnicalStudent ts = new TechnicalStudent();
		ts.setName("Bruna");
		ts.setAge(20);
		ts.setSex("Female");
		ts.setCourse("nurse");
		ts.setEnroll(02);
//		ts.unsubscribe();
		ts.practice();
		ts.payTuition();
		System.out.println(sh.toString());
		
	}

}
