package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class Voting_System {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int Age = sc.nextInt();
		System.out.println("Enter Citizenship(Y/N): ");
		String Citizenship = sc.next().toUpperCase();
		
		
		if(Age>=18 && Citizenship.equals("Y") ) {
			
			System.out.println("Eligible to vote...");
		}
		else {
			System.out.println(" not Eligible to vote...");

		}
		sc.close();
		
	}

}
