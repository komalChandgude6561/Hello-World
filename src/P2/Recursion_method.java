package P2;

public class Recursion_method {

	public static void Coundown(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		Coundown(n-1);
	}
	
	
	
	public static void main(String[] args) {
		Coundown(10);

	}

}
