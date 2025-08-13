package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class TempConverter {
        
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temp value : ");
		 double temperature = sc.nextDouble();
		 
		 System.out.println("Enter a unit(C or F) : ");
		 char unit = sc.next().charAt(0);
		 
		 double ConvertedTemperature;
		 
		 if(unit == 'C' || unit == 'c') {
			 
			ConvertedTemperature = (temperature*9/5)+32;
			System.out.println(temperature+" celcius is equal to: "+ ConvertedTemperature);
			 
		 }
		 
		 else  if(unit == 'F' || unit == 'f') {
			 
				ConvertedTemperature = (temperature-32)*5/9;
				System.out.println(temperature+" fahrenheit is equal to: "+ ConvertedTemperature);
				 
			 }
		 
		 else {
			 System.out.println("invalid unit entered .please enter C or F");
		 }
		 
	}

}
