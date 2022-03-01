package species;

public class Dog extends Wolf{

	public void move() {
		System.out.println("It runs");
	}
	

	public void feed() {
		System.out.println("it nurses");
	}
	

	public void makeNoise() {
		System.out.println("it makes barks noises (au! au! au!)");
	}

	public void react(String phrase) {
		if(phrase.equals("food time") || phrase.equals("hello")) {
			System.out.println("it waves the tail and barks");
		}
		else {
			System.out.println("it growls at you");
		}
	}
	
	public void react(int hours, int minutes) {
		if(hours < 12) {
			System.out.println("it waves the tail");
		}
		else if (hours > 18) {
			System.out.println("it ignores you");
		}
		else {
			System.out.println("it waves the tail and barks");
		}
	}
	
	public void react(boolean owner) {
		if(owner) {
			System.out.println("it waves the tail and barks");
		}
		else {
			System.out.println("it growls and barks at you");
		}
	}
	
	public void react(int age, float weight) {
		if(age < 5) {
			if(weight <10) {
				System.out.println("it waves the tail");
			}
			else {
				System.out.println("it barks");
			}
		}
		else {
			if(weight < 10) {
				System.out.println("it growls");
			}
			else {
				System.out.println("it ignores you");
			}
			
		}
	}
}







