package P2;

import java.util.Scanner;

public class EnterNum_Output_In_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number(1-26) : ");
		int num = sc.nextInt();
		sc.close();
		
		if(num >= 1 && num <= 26) {
			//if you want in uppercase 
			char character = (char)('A'+num-1);
			
			//if you  want in lowercase then 'A ' is replace by 'a' only .
			 
			
			System.out.println("Corresponding character : "+character);
			
		}
		
		else {
			System.out.println("Invalid input.please enter no. between 1 to 26.");
			
		  }
        }
	 	}

		

	

		
