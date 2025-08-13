package QuestionBank2;


//solve kelela nahi

import java.util.Scanner;

public class SumOfDigit_output_Willbe_Addition {
	
	
	
 public static void main(String[] args) {
	 
	 Scanner scanner =  new Scanner(System.in);
	  System.out.println("Enter no : ");
	  int a = scanner.nextInt();
	  System.out.println("Value of a is : "+a);
	  
	 System.out.println("Enter no : ");
	  int b= scanner.nextInt();
	  System.out.println("Value of bis : ");
	  
	  
	  SumOfDigit_output_Willbe_Addition s = new SumOfDigit_output_Willbe_Addition();
	  s.printAddition(a, b);
	  

	  
	

	  
	
}
	
	
	public void printAddition(int a , int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
