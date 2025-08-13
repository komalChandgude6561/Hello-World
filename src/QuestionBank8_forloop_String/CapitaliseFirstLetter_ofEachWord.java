package QuestionBank8_forloop_String;

public class CapitaliseFirstLetter_ofEachWord {

	public static void main(String[] args) {

		String str = "happy birthday to you shivaay";
		String newString  = "";
		boolean string =true;
		
		for(int i = 0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			if(string && Character.isLetter(ch)) {
				
				newString += Character.toUpperCase(ch);
				
				string =false;
				
			}
			
			
			else {
				newString  +=ch;
			}
			if(ch == ' ') {
				string = true;
				
			}
		}
		
		System.out.println("str: "+str);
		System.out.println("newString: "+newString);
	}

}
//incompete