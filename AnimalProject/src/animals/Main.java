package animals;

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
	}

}
