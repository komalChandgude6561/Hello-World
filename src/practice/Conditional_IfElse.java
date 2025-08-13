package practice;

public class Conditional_IfElse {

	public static void main(String[] args) {
		int Maths = 5;
		int Science = 67;
		int English = 78;
		int Age = 19;
		int totalMarks = Maths + Science + English ;
		
		//conditions:-->
		//1.age>17
		//2.every sub has marks>50
		//3.totalMarks >160
		
		if(Age>17) {
			if(Maths>50 && Science>50 && English>50) {		
			if(totalMarks>160) {
			System.out.println("eligible for admission");	
		
		}
			else{
				
				System.out.println(" not eligible due to total marks is less than 160");
				
			}
		
			}
		else {
			if(Maths<50) {
				
			System.out.println("Maths has marks less than 50");
			System.out.println("not eligible b.cz sub has marks less than 50");
			
			}
			if(Science<50) {
				System.out.println("Science has marks less than 50");
				System.out.println("not eligible b.cz sub has marks less than 50");
			}
				if(English<50) {
					System.out.println("English has marks less than 50");
					System.out.println("not eligible b.cz sub has marks less than 50");
				
				}
				}
			}
		
		else {
	
			
			System.out.println("not eligible for addmission b.cz age is < 17");
		}
	}
}


	


