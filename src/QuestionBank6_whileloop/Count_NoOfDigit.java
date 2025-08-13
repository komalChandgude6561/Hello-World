package QuestionBank6_whileloop;

import java.util.Scanner;

public class Count_NoOfDigit {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		while(num>0) {
			int digit = num%10;
	        System.out.println(digit);
			System.out.println(".................");
			num = num/10;
			System.out.println("remaing digits of given no is :  "+ num );
		}
	}

}
