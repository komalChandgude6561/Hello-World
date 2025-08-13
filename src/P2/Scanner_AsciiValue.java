package P2;

import java.util.Scanner;

public class Scanner_AsciiValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer (0-127 for standard ASCII) : ");
		int num = scanner.nextInt();
		scanner.close();
		if(num >= 0 && num <= 127) {
			char character =(char)num;
			
			System.out.println("ASCII character for  "+num + " : "+ character);
		}
		else {
			System.out.println("Invalid input.please enter no. between (0-127).");

		}
		
	
	
	
	
	
	}
	}
	