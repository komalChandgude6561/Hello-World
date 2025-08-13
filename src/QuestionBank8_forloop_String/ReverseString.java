package QuestionBank8_forloop_String;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Sujay";
		String reverse = "";
		
		for(int i= name.length()-1 ; i>=0 ; i--) {
//			char c = name.charAt(i);
//			System.out.println(c);
			reverse = reverse +name.charAt(i);			
		}
		System.out.println(name);
		System.out.println(reverse);

	}

}
