package QuestionBank8_forloop_String;

public class Converto_lowerToUpperCase_UpperToLowerCase {

	public static void main(String[] args) {

		String name = "happy birthday to you";
		for( int i = 0 ; i<name.length(); i++) {
			char ch = name.charAt(i);
			name = name.toLowerCase();
			System.out.println(name);
			System.out.println(System.identityHashCode(name));
			name = name.toUpperCase();
		System.out.println(name);	
		System.out.println(System.identityHashCode(name));
		
		}
	}

}
