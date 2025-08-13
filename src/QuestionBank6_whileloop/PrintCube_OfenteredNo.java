package QuestionBank6_whileloop;

import java.util.Scanner;

//incomplete
public class PrintCube_OfenteredNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
	    int  cube = 1;
	    int i =0;
		while( i<3) {
			cube*=num;
			
		
		System.out.println("the cube of given no "+num+" is " +cube);
		}
		i++;
		
	}

}
