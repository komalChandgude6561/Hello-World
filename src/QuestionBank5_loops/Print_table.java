package QuestionBank5_loops;

import java.util.Scanner;

public class Print_table {

	public static void main(String[] args) {

		//this code for table 
		
//		for(int a=1; a<=10 ;a++) {
//			int table= a*5;
//			System.out.println(table);
//		}
		
		
		
		//this code for reverse table 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input: ");
		int num = sc.nextInt();
		for(int a=10 ; a>=1 ; a--) {
			int table = a*num;
			System.out.println(table);
		}
	}

}
