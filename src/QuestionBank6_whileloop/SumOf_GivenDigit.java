package QuestionBank6_whileloop;

import java.util.Scanner;

public class SumOf_GivenDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit : ");
		int num = sc.nextInt();
		 int sum =0;
		while(num!=0) {
			int digit = num%10;
			sum +=digit;
			num/=10;
		}
		System.out.println("the sum of digit is: "  +sum);
	}

}
