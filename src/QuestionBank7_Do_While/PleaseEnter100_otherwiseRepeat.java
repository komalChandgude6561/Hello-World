package QuestionBank7_Do_While;

import java.util.Scanner;

public class PleaseEnter100_otherwiseRepeat {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a=1,number;
do {
	
          System.out.println("please enter no. greater than 100 :");
          
           number = sc.nextInt();

          }while(number<=100);

if(number>=100) {
	System.out.println("you entered greater than 100 :  "+ number);
}
	
	
	}

}
