package QuestionBank8_forloop_String;

public class Count_UpperCase_LowerCase {

	public static void main(String[] args) {

		String name= "SujaY";
		int upperCase= 0;
		int lowerCase=0;
		
		for(int i =0 ; i<name.length(); i++) {
			char c = name.charAt(i);
			if(Character.isUpperCase(c)) {
				upperCase++;
				
			}
			
			else if(Character.isLowerCase(c)) {
				lowerCase++;
			}
		}
		System.out.println("UpperCase count is "+ upperCase);
		System.out.println("LowerCase count is "+ lowerCase);

	}

}
