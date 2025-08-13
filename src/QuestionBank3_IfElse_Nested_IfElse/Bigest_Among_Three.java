package QuestionBank3_IfElse_Nested_IfElse;

public class Bigest_Among_Three {

	public static void main(String[] args) {

		int x = 5;
		int y = 88;
		int z = 23;
		
		
		if(x>y && x>z) {
			
			System.out.println("x is bigest one among three.");
			}
		else  if (y>z && y>x){
			System.out.println("y is bigest one among three.");
			
		}
		else {
			System.out.println("z is bigest one among three.");
		}
	}

}
