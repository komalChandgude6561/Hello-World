package QuestionBank8_forloop_String;

public class replace_spacewith_hypen {

	public static void main(String[] args) {

		String name = "Mayuri Satish Deshpande";
		for(int i = 0 ; i<name .length(); i++) {
			
			char ch = name.charAt(i);
			System.out.println(name.replace(" ", "-"));
			break;
		}
	}

}
