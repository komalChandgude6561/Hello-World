package QuestionBank5_loops;

import java.util.Scanner;

public class NaturalNo1_to_n {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter input: ");
           
           int n= sc.nextInt();
           int a = 0;    //but natural no from 0.
           
           for( a=0 ; a<=n ;a++) {
        	   System.out.println(a);
           }
		
	}

}
