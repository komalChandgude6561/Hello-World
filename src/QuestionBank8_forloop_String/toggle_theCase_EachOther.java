package QuestionBank8_forloop_String;

public class toggle_theCase_EachOther {
	public static String toggleCase(String inputString) {
		StringBuilder toggledString = new StringBuilder();
		
		for(int i =0 ; i<inputString.length() ; i++) {
			char currentChar = inputString.charAt(i);
			
			if(Character.isUpperCase(currentChar)) {
				toggledString.append(Character.toLowerCase(currentChar));
				}
			else if(Character.isLowerCase(currentChar)) {
				toggledString.append(Character.toUpperCase(currentChar));
			}
			else {
				//if its not an alphabet, append it is number ,symbol
			
			toggledString.append(currentChar);
		}
	}
	return toggledString.toString();	
	}
	

	public static void main(String[] args) {

		String originalString = "HeLlO wOrLd123!";
		String result = toggleCase(originalString);
		System.out.println("original String:  "+originalString);
		System.out.println("toggled String:  "+result);
	}

}
