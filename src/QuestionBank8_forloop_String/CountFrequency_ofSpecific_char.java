package QuestionBank8_forloop_String;

public class CountFrequency_ofSpecific_char {

	public static void main(String[] args) {

		String name= "This website is awesome";
		char ch = 'w';
		int frequency = 0;
		for(int i =0 ; i<name.length() ; i++) {
			
			if(ch == name.charAt(i)) {
				frequency++;
			}
		}
		
		System.out.println("frequency of " +ch + " = "+frequency);
	}

}
