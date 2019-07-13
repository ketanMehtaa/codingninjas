package vehicle;
public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
/////
            
		Vehicle k = new Car();
		  k.color="green";
		  k.print();
//		  k.isConvertible=false;
//in above line you only assecc common members of both the classes
		  // you can not specify the unique properties of the car in the above line
		  
		  
		Car c = new Car();
		c.numGears = 10;
		c.color = "Blackeeee";
		c.setMaxSpeed(11100);
		c.print();
	}
}
