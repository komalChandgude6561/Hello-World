package method;


//method overloading is define as java is a feature it allows a class to have multiple method with same method name but diff paramaeters.
public class Method_Overloading {
	
	static int printAdd(int a , int b) {
		int add = a + b;
		System.out.println(add);
		return add;
	}
	
	static float printAdd(float a , float b) {
		float add = a + b;
		System.out.println(add);
		return add;
	}

	public static void main(String[] args) {
		
		printAdd(23 , 34);
		printAdd(23.45f , 56.43f);

	}

}
