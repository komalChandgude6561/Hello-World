package QuestionBank5_loops;

import java.util.Scanner;

public class Naturalno_in_reverse_from100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input: ");
		int num = sc.nextInt();
		
	   for(num=100 ; num>=0 ; num--) {
		   
		   System.out.println(num);
	   }
	}

}
