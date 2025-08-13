package QuestionBank5_loops;

public class Pallindrome_or_not {
	
	//incomplete and not correct

	public static void main(String[] args) {
		int t=143 ,r;

		for(int reverse = 0; t>0 ; t=t/10) {
			
			r= t/10;
			reverse = reverse*10 +r;	
		
		System.out.println("reverse  of given no is  " + reverse);
	
		if(143 == reverse) {
			System.out.println("no is pallindrome ");
			
		}
		else {
			System.out.println("no is not pallindrome ");

		}
		
		
		
	}
}
}