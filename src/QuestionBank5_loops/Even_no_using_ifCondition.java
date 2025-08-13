package QuestionBank5_loops;

public class Even_no_using_ifCondition {

	public static void main(String[] args) {
		//by using if condition

		for( int a=1 ; a<=100 ; a++ ) {
			 
			if(a % 2 == 0) {
				System.out.println(a);
			}
	}
		//without using if condition
		
		for(int a =2 ; a<=100 ; a=a+2) {
			
			
			System.out.println(a);
		}

}}
