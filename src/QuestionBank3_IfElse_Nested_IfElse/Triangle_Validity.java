package QuestionBank3_IfElse_Nested_IfElse;

public class Triangle_Validity {

	public static void main(String[] args) {
            
		int a = 90;
		int b = 45;
		int c = 45;
		int sum = a+b+c;
		
		if(sum==180 && a>0 && b>0 && c>0) {
			
			System.out.println("now we create triangle!!!");
		}
		else {
			System.out.println("enter valid data to create triangle");
		}
	}

}
