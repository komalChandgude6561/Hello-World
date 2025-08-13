package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class MenuChoice_With_MathsOption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num between 1 to 4 : ");
		int num = sc.nextInt();
		

		
		int a = 4;
		int b = 6;
		int sum= a+b;
		int mul = a*b;
		int sub = a-b;
		int div = a/b;
		
		if(num ==1) {
			System.out.println("addition : "+sum);
		}
		else if(num ==2) {
			System.out.println("multiplication : "+mul);
		}
		else if(num ==3) {
			System.out.println("subtraction : "+sub);
		}
		else if(num ==4) {
			System.out.println("division : "+ div);
		}
		else {
			System.out.println("invalid ");
	
	}
	}

}
