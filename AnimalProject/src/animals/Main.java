package animals;

import species.Dog;
import species.Kangoro;

public class Main {

	public static void main(String[] args) {
		
		Memmal m = new Memmal();
		m.getFurColor();
		m.move();
		m.feed();
		m.makeNoise();

		System.out.println("-----------------------------------");
		
		Kangoro k = new Kangoro();
		k.getFurColor();
		k.move();
		k.feed();
		k.makeNoise();

		System.out.println("-----------------------------------");
		
		Dog d = new Dog();
//		d.react("food time");
//		d.react(19,05);
//		d.react(false);
		d.react(4, 11.0f);
		
		
		
	}

}
