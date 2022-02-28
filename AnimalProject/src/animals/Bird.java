package animals;

public class Bird extends Animal{
	
	private String featherColar;
	
	public void makeNaste() {
		System.out.println("it builds nastes");
	}
	
	@Override
	public void move() {
		System.out.println("It flies");
	}
	
	@Override
	public void feed() {
		System.out.println("it fruit");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("it makes bird noises");
	}

	public String getFeatherColar() {
		return featherColar;
	}

	public void setFeatherColar(String featherColar) {
		this.featherColar = featherColar;
	}
	
	
}
