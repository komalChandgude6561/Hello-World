package QuestionBank5_loops;

import java.util.Scanner;

public class Cube_of_givenNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = sc.nextInt();
		
		int cube = 1;
		for(int i =0 ; i<3  ; i++ ) {
			cube*=num;
		}
		System.out.println("the cube of given no "+num+" is " +cube);

	}

}
