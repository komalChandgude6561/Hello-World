package P2;

import java.util.Scanner;

public class SwitchCase_Day_Into_Integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day : ");
		String Input = sc.next();
		
		switch (Input) {
		case "Monday": {
			
			System.out.println("1");
			break;
		}
case "Tuesday": {
			
			System.out.println("2");
			break;
		}
case "Wednesday": {
	
	System.out.println("3");
	break;
}
case "Thursday": {
	
	System.out.println("4");
	break;
}
case "Friday": {
	
	System.out.println("5");
	break;
}
case "Saturday": {
	
	System.out.println("6");
	break;
}
case "Sunday": {
	
	System.out.println("7");
	break;
}
		default:
			System.out.println("Invalid Input");
		}
		
	}}