package QuestionBank3_IfElse_Nested_IfElse;

public class LeapYear_Checker {

	public static void main(String[] args) {

		int year = 1996;
		
//	method 1: by using  operators
//		if((year%4==0 && year%100!=0) || year%400==0) {
//			System.out.println("this year is leap year");
//		}
//		else {
//			System.out.println("this is not leap year");
//		}
		
		
		// by using nested if-else
		
	
	
	if(year % 4 == 0) {
		if(year % 100 ==0) {
			if(year % 400 == 0) {
				System.out.println("this year is leap year");
			}
		
		
		
			else {
				System.out.println("this year is  not leap year");
			}
		}
		
		else {		
			System.out.println("this year is leap year");
		}
	}
	
	else {
		System.out.println("this year is not leap year");
	}
	

	}
}
