package species;

import animals.Bird;

public class Eagle extends Bird{
	
	@Override
	public void move() {
		System.out.println("It flies");
	}
	
	@Override
	public void feed() {
		System.out.println("it eats small animals");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes Eagles noises");
	}

}
