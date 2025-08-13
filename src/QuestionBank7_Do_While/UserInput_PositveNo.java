package QuestionBank7_Do_While;

import java.util.Scanner;

public class UserInput_PositveNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1st method more effective n accurate
		int number;

		int a=0;
		do {
			
			System.out.println("Enter a positive no. : ");
			number = sc.nextInt();

	}while(number<=0);
		System.out.println("you entered a positive no.: " + number);
             
		//2nd method is solved by me 
		
		
		
		/*		
		System.out.println("Enter a positive no. : ");
		int number = sc.nextInt();
		int a =0;
		do {
			//System.out.println("you enter a positive no");
			if(number>0) {
				System.out.println("positiveno" +number);
			}
			else {
				System.out.println("negative plz enter a positive no" +number);
			}
		}while(number>=0);
		*/
		
		
		
}}
