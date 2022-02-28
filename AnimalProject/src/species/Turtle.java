package species;

import animals.Lizard;

public class Turtle extends Lizard{
	
	@Override
	public void move() {
		System.out.println("It crawls and swims");
	}
	
	@Override
	public void feed() {
		System.out.println("it fish");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes Turtle noises");
	}

}
