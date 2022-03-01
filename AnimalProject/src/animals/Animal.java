package animals;

public abstract class Animal{
	protected double weight;
	protected int age;
	protected int members;
	
	public abstract void move();
	public abstract void feed();
	public abstract void makeNoise();
}