package QuestionBank3_IfElse_Nested_IfElse;

public class Character_Classifier {

	public static void main(String[] args) {

		char ch = '7';
		
		
		if (ch>=65 && ch<=90) {
			System.out.println("ch is in uppercase");
		}
		else if(ch>=97 && ch<=122) {
			System.out.println("ch is in lowercase");
			
		}
		else {
			System.out.println("this is digit");
		}
	}

}
