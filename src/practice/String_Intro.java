package practice;

public class String_Intro {

	public static void main(String[] args) {
		
		
		String s = "Irise Institute";
		
		
		//to evaluate length of string : it count space also
		System.out.println(s.length());
		
		//Case_sensitive: it changes lowercase to uppercase and vice versa.
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		// charAt: index la konta character present aahe te check krt.
		//it does not show o/p b.cz at 5 index la ""space present aahe.

		char c = s.charAt(5);
		System.out.println(c);
		
		//concat method use to join two Strings
		
		System.out.println(s.concat(" PUNE"));
		
		//Endswith : shows last letter present in string:it gives boolean value i.e true/false
		//Startwith :shows first letter presen in string : it gives boolean value i.e true/false
		
		System.out.println(s.endsWith("q"));
		System.out.println(s.startsWith("i"));
		

		System.out.println(s.endsWith("e"));
		System.out.println(s.startsWith("I"));
		
		//indexof :gives index no of character present in string
		
		System.out.println(s.indexOf("r"));
		
		//contains : it  check  the entered string/char contain present in string or not.
		System.out.println(s.contains("X"));
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains("Irise"));
		
		//isEmpty: s hi string empty aahe ki nahi
		System.out.println(s.isEmpty());
		
//		what is the diff between both isEmpty & isblank?
		System.out.println(s.isBlank());
		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
