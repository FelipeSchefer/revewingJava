package youtube;

import viewer.Student;
import viewer.View;

public class Main {

	public static void main(String[] args) {

		Video v[] = new Video[3]; //---------------------------------- VIDEO
		
		v[0] = new Video("React.js class 01");
//		System.out.println(v[0].toString());
				
		v[1] = new Video("Node.js class 02");
//		System.out.println(v[1].toString());
				
		v[2] = new Video("Java class 03");
//		System.out.println(v[1].toString());
		
		
		Student s[] = new Student[2]; //----------------------------------- STUDENT
		
		s[0] = new Student("Felipe", 28, "M", "fts" );
//		System.out.println(s[0].toString());
			
		s[1] = new Student("Julia", 18, "F", "ju");
//		System.out.println(s[1].toString());
		
		
		View view[] = new View[5]; // ----------------------------------- VIEW
		
		view[0] = new View(s[0], v[0]); 
		view[0].estimate();

		System.out.println(view[0].toString());
		
		view[1] = new View(s[1], v[1]);
		view[1].estimate(52.5f);
		System.out.println(view[1].toString());
		

	}

}
