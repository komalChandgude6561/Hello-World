package method;

public class Constructor {
	int x ;
	int mul;
	

	public Constructor(int a , int b) {
		x = 6;
		int mul = a*b;
		System.out.println(mul);
		
		
	}
	
	public Constructor(float x , float y) {
		float mul;
		mul = x*y;
		System.out.println(mul);
		
	}
	public static void main(String[] args) {
		Constructor c = new Constructor(4,5);
		System.out.println(c.x);
		
		
		Constructor s = new Constructor(6.0f, 5.6f);
		
		
		


	}

}
