package QuestionBank2;

import java.util.Scanner;

public class FindOut_SmallestNo_Method {
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of a : ");
	int a = sc.nextInt();
	

	
	System.out.println("enter value of b is : ");
	int b = sc.nextInt();
	
	
	System.out.println("Enter value of c is : ");
	int c = sc.nextInt();

	
	
	FindOut_SmallestNo_Method f = new FindOut_SmallestNo_Method();
	
	int smallestNumber = f.printSmallestNo(a, b, c);
	System.out.println("smallest value in above numbers is : " +smallestNumber);
	
	}
	
	
	public int printSmallestNo(int a , int b , int c) {
		return Math.min(Math.min(a, b) ,c);
		
	}

}
