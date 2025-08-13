package practice;

public class Local_GloableVariable {
	
	 int rollNo = 45;
	 String S = "i'm in class body";
	 float f = 345.56f;
	 float g = rollNo;

	public static void main(String[] args) {
		int a = 43;
		int b = 7;
		int mul = a*b;
		System.out.println(mul);
		
		//object creation : to print global variable
		
		Local_GloableVariable v = new Local_GloableVariable();
		System.out.println(v.rollNo);
		System.out.println(v.S);
		System.out.println(v.g);
		



		
		
		
		
		
		
	}

}
