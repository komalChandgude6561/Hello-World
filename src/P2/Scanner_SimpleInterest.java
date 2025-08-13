package P2;

import java.util.Scanner;

public class Scanner_SimpleInterest {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of p : ");
		double p = sc.nextDouble();
		System.out.println("Value of p is : "+p);
		
		System.out.println("Enter value of r : ");
		double r = sc.nextDouble();
		System.out.println("Value of r is : "+ r);
		
		System.out.println("Enter value of t : ");
		double t = sc.nextDouble();
		System.out.println("Value of t is : "+ t);
		
		
		Scanner_SimpleInterest s = new Scanner_SimpleInterest();
		 double simpleinterest = s.printSimpleInterest(p, r, t);
		System.out.println(simpleinterest);
		
		
		
		
	}
	
	public double  printSimpleInterest(double p, double r , double t ) {
		
		double SI = (p*r*t)/100;
		return SI;
		
		
	}
	
	

}
