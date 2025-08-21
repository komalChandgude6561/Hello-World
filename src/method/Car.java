package method;

public class Car {
	public void FullThrottle() {
		System.out.println("the car going as fast as it can");
		
	}
	public void Speed(int maxSpeed) {
		System.out.println("MaxSpeed is : "+maxSpeed);
		
	}

	public static void main(String[] args) {

		Car c = new Car();
		
		c.FullThrottle();
		c.Speed(200);
	}

}
