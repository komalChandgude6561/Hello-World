package Loops;

public class While_loop {

	public static void main(String[] args) {
		//while chya parenthesis mdhli return type boolean aste
		int a =1;
		
//		while(a<=5) {
//			System.out.println(a);
//			a++;
//		
//		}
		
		//when we have to skip 5
		while(a<=10) {
			
			if(a==5) {
				a++;
				continue;  
				
				//.....> it skip no
				//break;       ......>it break loop 
			}
			System.out.println(a);
			a++;
		}

		
	}

}
