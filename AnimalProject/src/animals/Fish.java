package animals;

public class Fish extends Animal{

	private String finColar;
	
	public void makeBubbles() {
		System.out.println("it makes bubbles");
	}
	
	@Override
	public void move() {
		System.out.println("It swims");
	}
	
	@Override
	public void feed() {
		System.out.println("it eats seafood");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes no sound");
	}

	public String getFinColar() {
		return finColar;
	}

	public void setFinColar(String finColar) {
		this.finColar = finColar;
	}
	
	
}
