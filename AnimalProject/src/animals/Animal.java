package animals;

public abstract class Animal{
	private double weight;
	private int age;
	private int members;
	
	public abstract void move();
	public abstract void feed();
	public abstract void makeNoise();
}