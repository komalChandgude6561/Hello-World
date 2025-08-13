package P2;

public class Conditional_State_nested_if {

	public static void main(String[] args) {
int a = 43;
if (a%2==0) {
	System.out.println("no is even");
	
	if (a%10==0) {
		System.out.println("no is divisible by 10");
		
	} else {
		
		
		System.out.println("no is not divisible by 10");

	}
	
	
} else {
	System.out.println("no is odd");

}

	}

}
