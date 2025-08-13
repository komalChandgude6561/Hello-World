package QuestionBank6_whileloop;

import java.util.Scanner;

public class Print_SquareOfNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
				int square = sc.nextInt();
				int i =1;
				while(i<100) {
					System.out.println(i*i);
				i++;
				}
				
	}

}
