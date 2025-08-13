package QuestionBank8_forloop_String;

public class CheckString_isPallindromeOrNot {

	public static void main(String[] args) {

		String name= "nayan";
		String rev = "";
		for(int i = 0 ; i<name.length() ; i++) {
			
			rev = name.charAt(i)+rev;
			
		}
		if(rev.equals(name)) {
			System.out.println(name + " is pallindrome");
			
		}
		else {
			System.out.println(name+ " is not pallindrome");
		}
	}

}
