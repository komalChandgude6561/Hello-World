package QuestionBank8_forloop_String;

public class ASCII_SumOf_AllCharacter_InString {

	public static void main(String[] args) {

		String name = "hi";
		int asciiSum = 0;
		
		for(int i = 0 ; i<name.length() ; i++) {
			char ch = name.charAt(i);
			asciiSum += (int)ch;	
		}
		System.out.println("ASCII sum of \" "+ name+ "\" is: " +asciiSum);
		
	}

}
