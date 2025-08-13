package P2;

import java.util.Scanner;

public class Scanner_char_into_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");

		String  ch = sc.nextLine();
		
		//System.out.println("Enter Character : "+ch);
		
		if(ch.length()>0) {
			
			char character = ch.charAt(0);
			
			System.out.println("you entered : "+character);
		}
		
		else {
			System.out.println("invalid input");
		}
		
	}

}
