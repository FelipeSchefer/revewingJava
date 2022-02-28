package species;

import animals.Memmal;

public class Kangoro extends Memmal{
	
	public void useBag() {
		System.out.println("it uses Bag to carry its kid");
	}
	
	@Override
	public void move() {
		System.out.println("It hops");
	}
	
	@Override
	public void feed() {
		System.out.println("it nurses");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes Kanguro noises");
	}
	
}