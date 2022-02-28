package species;

import animals.Lizard;

public class Snake extends Lizard{
	
	@Override
	public void move() {
		System.out.println("It crawls");
	}
	
	@Override
	public void feed() {
		System.out.println("it eats small animals");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes snakes noises");
	}

}
