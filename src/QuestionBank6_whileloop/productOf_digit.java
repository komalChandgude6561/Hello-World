package QuestionBank6_whileloop;

import java.util.Scanner;

public class productOf_digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int product = 1;
		int tempNum = number;
		while(tempNum>0) {
			int digit = tempNum % 10;
			product = product*digit;
			tempNum = tempNum/10;
		}
		System.out.println("the product of digit in "+number +"is: "+product);
	}

}
