package QuestionBank6_whileloop;

public class Reverse_digit {
//incomplete
	public static void main(String[] args) {

		int num =1234,reversed =0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed*10+digit;
			
		}
		System.out.println("reveresed no is : "+ reversed);
		
		
	}

}
