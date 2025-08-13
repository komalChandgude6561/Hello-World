package P2;

import java.util.Scanner;

public class Scanner_IfElse_greaterNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("ENter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("ENter third number: ");
		int num3 = sc.nextInt();
		
		if (num1>num2)
		if(num1>num3)
			System.out.println("the  greatest number is : " + num1);
		
		if(num2>num3)
			if(num2>num1)
				System.out.println("the greatest no is : " +num2);
		
		if(num3>num1)
			if(num3>num2)
System.out.println("the greatest no is : "+ num3);			

	}

}
