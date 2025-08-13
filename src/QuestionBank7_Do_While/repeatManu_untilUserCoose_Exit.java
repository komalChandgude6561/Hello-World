package QuestionBank7_Do_While;

import java.util.Scanner;

public class repeatManu_untilUserCoose_Exit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String exit;
		String username;
		
		do {
			
			System.out.println(" to exit , please type Exit : ");
			 username = sc.nextLine();
		}while(!username.equals("Exit"));
		
		System.out.println("you successfully logout!");
	}

}
