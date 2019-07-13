package vehicle;

public class Car extends Vehicle {
	int numGears;
	private boolean isConvertible;
	
	public void print() {
		System.out.println("Car color : " + color);
		System.out.println("Car Speed : " + maxSpeed);
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
		super.print();
	}
}
