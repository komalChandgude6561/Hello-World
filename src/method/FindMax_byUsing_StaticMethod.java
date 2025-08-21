package method;

public class FindMax_byUsing_StaticMethod {
	static int max ;
	
	
	static int findMax(int a , int b) {
		a = 23;
		b = 64;
		max = Math.max(a, b);
		return max;
		
	}

	public static void main(String[] args) {
		
		System.out.println("max no is : "+FindMax_byUsing_StaticMethod.findMax(23, 64));

	}

}
