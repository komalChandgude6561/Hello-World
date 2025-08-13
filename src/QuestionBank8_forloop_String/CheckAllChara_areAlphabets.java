package QuestionBank8_forloop_String;

public class CheckAllChara_areAlphabets {

	public static void main(String[] args) {
		String name = "Bhavi9 bh@gya";
	     boolean alphabetic = true;
		for(int i = 0 ; i<name.length() ; i++) {
			char ch = name.charAt(i);
			
			if(Character.isLetter(ch)) {
				
				alphabetic = true;	
			}
			else {
				alphabetic = false;
			}
			}
		
		}
	}


