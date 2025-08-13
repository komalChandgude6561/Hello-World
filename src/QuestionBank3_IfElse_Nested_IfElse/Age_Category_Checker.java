package QuestionBank3_IfElse_Nested_IfElse;

public class Age_Category_Checker {

	public static void main(String[] args) {

		
		int age = 7;
		
		if(age>=0 && age<=12) {
			System.out.println("Child ");
		}
		
		else if(age>=13 && age<=17) {
			System.out.println("Teen ");
		}
		
		else if(age>=18 && age<=59) {
			System.out.println("Adult ");
		}
		else if(age>=60) {
			System.out.println("Senior ");
		}
		else {
			System.out.println("Invalid data Enter");
		}
	}

}
