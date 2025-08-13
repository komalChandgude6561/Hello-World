package practice;

public class RevisionOfAllMethod {
	int rollNo = 15;
	
	
	//void and non-parameterised method
	 
	public void printName() {
		String name = "kshitija";
		System.out.println(name);
	}
	
	
	//void and parameterised method
	
	public void printAddition(int a, int b) {
		
		int sum;
		sum = a+b;
		System.out.println(sum);
		
	}
	
	
	//return and non-parameterised method 
	
	public char printAsciiValue() {
		char s =72;
		return s;
		
	}
	
	//return and parameterised method
	
	public float printSimpleInterest(float p , float r, float t) {
		float simpleInterest = (p*r*t)/100;
		return simpleInterest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
