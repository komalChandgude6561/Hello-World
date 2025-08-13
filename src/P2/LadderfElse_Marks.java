package P2;

import java.util.Scanner;

public class LadderfElse_Marks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if( marks<=100 && marks >=90) {
			System.out.println("A+ Grade");
		}
		
		else if( marks<=89 && marks >=80) {
			System.out.println("A Grade");
		}
		else if( marks<=79 && marks >=60) {
			System.out.println("B+ Grade");
		}
		else if( marks<=59 && marks >=35) {
			System.out.println("C Grade");
		}
		
		else {
			System.out.println("FAIL");
		}
	}

}
