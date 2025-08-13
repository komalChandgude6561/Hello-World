package QuestionBank6_whileloop;

import java.util.Scanner;

public class Factorial_no {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no. : ");
			int num = sc.nextInt();
			 int a =1;
			 int fact =1;
			
			while(a<=num) {
				
				 fact *=a;
				 a++;
				 }
				 System.out.println("factorial of given no is: " +fact);
				
			}

	}


