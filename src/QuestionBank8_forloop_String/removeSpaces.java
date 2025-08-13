package QuestionBank8_forloop_String;

public class removeSpaces {

	public static void main(String[] args) {

		String name= "happy birthday to you";
		
		StringBuilder s = new StringBuilder();
		
		for(int i = 0 ; i<name.length() ; i++) {
			char ch = name.charAt(i);
			if(ch != ' ') {
				s.append(ch);
			}
		}
		String k = s.toString();
	System.out.println("original String is : "+name);
	System.out.println("String without spaces : "+ k);
	}

}
