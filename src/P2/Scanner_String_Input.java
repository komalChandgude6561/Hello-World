package P2;

import java.util.Scanner;

public class Scanner_String_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();

		System.out.println("Enter your String "  +line);
		
		System.out.println(line);
		sc.close();

	}

}
