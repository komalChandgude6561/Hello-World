package QuestionBank5_loops;

import java.util.Scanner;

public class printsumof_natural_even_oddnno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		//print sum of even no from 1 to n
		int sum = 0;
//		
//	for(int a = 0 ; a<=n ;a=a+2) {
//		sum +=a;
//		System.out.println("even no "+ a);
//		System.out.println("the sum of all even no is "+ sum );
//	}
//	
		//for print sum of odd no 1 to n.
		for(int a = 1 ; a<=n ; a= a+2) {
			sum += a;
		System.out.println("odd no "+ a);
	System.out.println("the sum of all odd no is "+sum);
		
		}
		
		/*print all natural
	int	sum = 0;

	for( int a =1 ; a<=n ; a++) {
		  sum += a;
		 
		   * sum+a=0
		   * 0+1=1
		   * 1+2=3
		   * 3+3=6
		   * 6+4=10
		   * 10+5=15
		   
		System.out.println("the sum ofthe first " + n + " naural no is " +sum);
		                                          
		} 
		
		
		
		
		*/
	}

	}
