package practice;

import java.util.Scanner;

public class Conditional_State_If_Else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		System.out.println("Enter digit :  ");
		int number = sc.nextInt();

		
		if (number>0) {
			System.out.println("no is positive");
			
			
		} else if (number<0) {
			System.out.println("no is negative");
			
		}
		else{
			System.out.println("no is 0");

		}
	}

}
