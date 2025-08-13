package QuestionBank3_IfElse_Nested_IfElse;

public class Tax_Bracket_Checker {

	public static void main(String[] args) {

		double income = 1.5;
		
		if(income==2.5 && income<5 ) {
			System.out.println("5% tax should pay.");
		}
		
		else if(income==5 && income<10 ) {
			System.out.println("20% tax should pay.");
		}
		
		else if(income==10 ) {
			System.out.println("30% tax should pay.");
		}
	
		else{
			System.out.println(" below 2.5 no tax to pay .");
		}
		
	}

}
