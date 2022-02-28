package species;

import animals.Memmal;

public class Dog extends Memmal{
	
	@Override
	public void move() {
		System.out.println("It runs");
	}
	
	@Override
	public void feed() {
		System.out.println("it nurses");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes barks noises");
	}

}
