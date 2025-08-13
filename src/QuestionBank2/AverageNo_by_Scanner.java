package QuestionBank2;

import java.util.Scanner;

public class AverageNo_by_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//double Average_no =  sc.nextDouble();
		System.out.println("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.println("value of a is : " +a);
		
		
		
		
		
		System.out.println("Enter value of b : ");
		double b= sc.nextDouble();
		System.out.println("value of b is : " +b);
		
	
		System.out.println("Enter value of c : ");
		double c = sc.nextDouble();
		System.out.println("value of c is : " +c);
		
		
		AverageNo_by_Scanner s = new AverageNo_by_Scanner();
		 double AverageNum = s.printAverageNo(a, b, c);
		
		
		
		
		
		System.out.println("Average value from above input is : "+AverageNum);
		
	
		
	}
	
	public double printAverageNo(double a , double b , double c) {
		double averagenumber =( a+b+c)/3;
		return averagenumber;
				
		
	}

}
