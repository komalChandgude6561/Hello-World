package QuestionBank7_Do_While;

import java.util.Scanner;

public class UseName_Enter_admin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String username;
		String admin;
	
		
		do {
			
			System.out.println("Enter username : ");
			 username = sc.nextLine();
			
		}while(!username.equals("admin"));
		System.out.println("you entered correct username! Welcome Admin!!");

		
		
		
	
	
	}

}
