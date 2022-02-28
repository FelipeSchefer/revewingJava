package animals;

public class Memmal extends Animal{
	private String furColor;
	
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
		System.out.println("it makes memmals noises");
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	
	
}
