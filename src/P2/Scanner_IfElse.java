package P2;

//leap year or not

import java.util.Scanner;

public class Scanner_IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year= sc.nextInt();
		if(year%4==0 ) {
			System.out.println("this year  is leap year");
		}
		else {
			System.out.println("this year is not leap year ");
		}
	}

}
