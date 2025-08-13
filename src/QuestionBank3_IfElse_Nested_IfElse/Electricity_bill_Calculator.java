package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class Electricity_bill_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units : ");
		int unit = sc.nextInt();
		
            if(unit<=100) {
            	System.out.println("5 rs per unit ");
            }
            else if( unit>=101 && unit<300) {
            	System.out.println("7 rs per unit ");
            }
            else {
            	System.out.println("above 300 unit light will be 10 rs per unit");
            }
		 
		 
	}

}
