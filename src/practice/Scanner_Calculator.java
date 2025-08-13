package practice;

import java.util.Scanner;

public class Scanner_Calculator {
	
	
	//Scanner is used to take input from console. existing code does not change.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Value of a is : "+ a);
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.println("Value of b is : "+ b);
		
			
		Scanner_Calculator s = new Scanner_Calculator();
		s.printSum(a, b);
		
		
	}
	
	
	public void printSum(int a , int b)
	{
		int sum = a+b;
		System.out.println(sum);
		
	}

}
