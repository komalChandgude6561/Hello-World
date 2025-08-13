package P2;

import java.util.Scanner;

public class Scanner_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("value of a : "+ a );
		
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("value of b is : " + b);
	
		Scanner_Calculator c = new Scanner_Calculator();
		c.printSum(a,b);
		
		
		
	}
	
	public void printSum(int a , int b) {
		int sum  =a+b;
		System.out.println("Addition is : "+sum);
	}
	
	
	
	
	
	

}
