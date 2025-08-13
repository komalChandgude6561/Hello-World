package P2;

public class MethodBasic {
	

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("end");
		
		//object creation(m is reference variable)
		MethodBasic m = new MethodBasic();
		m.getName();    //fun call 
		m.getAge();     //fun call

	}
	public void getName() {
		System.out.println("i an in getName method");
	}
	
	//static word is optional for customize(created by user) method.
	
	public  void getAge() {
		System.out.println("i am 29 yr old");

	}

}
