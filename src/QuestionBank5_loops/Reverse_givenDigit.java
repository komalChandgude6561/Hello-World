package QuestionBank5_loops;

public class Reverse_givenDigit {
	
	//i want explanation of this code

	public static void main(String[] args) { 
		int num = 1234567 , reveresed = 0;

		for(; num!=0  ; num/=10) {
			int digit = num %10 ;
			
			reveresed = reveresed*10 +digit;		
		}
		System.out.println("reveresed no : " + reveresed);
	}

}
