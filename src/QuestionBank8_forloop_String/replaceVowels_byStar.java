package QuestionBank8_forloop_String;

public class replaceVowels_byStar {

	public static void main(String[] args) {

		String name = "kanyakumari";
		String newString = "";
		 for(int i = 0 ; i<name.length() ; i++) {
			
			 char ch = name.charAt(i);
			 if(ch=='i' || ch=='o'||ch=='u' | ch=='e' || ch=='a') {
				 newString += "*";
			 }
			 else {
				 newString += name.charAt(i);
			 }
		 }
			System.out.println("original String: "+ name);
			System.out.println("new String: "+newString);
			
			 
			 
		 }
			 
		 }
		 


