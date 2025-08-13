package QuestionBank5_loops;

public class Factorial_no_usingFor {

	public static void main(String[] args) {
		int n =10;
		int fact = 1;

		for(int a =2 ; a<=10 ; a++) {
			
			fact *=a;
			System.out.println("factorial of"+ a+ " is : "+fact);
	}

}
}