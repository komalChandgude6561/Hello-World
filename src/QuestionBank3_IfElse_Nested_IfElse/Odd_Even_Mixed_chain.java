package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class Odd_Even_Mixed_chain {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = sc.nextInt();

System.out.println("Enter second number: ");
int num2 = sc.nextInt();
System.out.println("Enter third number: ");
int num3 = sc.nextInt();

if(num1%2==0 && num2%2==0 && num3%2==0) {
	System.out.println("Even Chain");
}

else if(num1%2!=0 && num2%2!=0 && num3%2!=0) {
	System.out.println("Odd Chain");
}

else {
	System.out.println("Mixed chain");
}


}

}
