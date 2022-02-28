package animals;

public class Lizard extends Animal {

	private String scaleColar;
	
	@Override
	public void move() {
		System.out.println("It crawls");
	}
	
	@Override
	public void feed() {
		System.out.println("it eats vegetables");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes lizard noises");
	}

	public String getScaleColar() {
		return scaleColar;
	}

	public void setScaleColar(String scaleColar) {
		this.scaleColar = scaleColar;
	}
	
	
}
