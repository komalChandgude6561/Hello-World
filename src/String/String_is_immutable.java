package String;

public class String_is_immutable {

	public static void main(String[] args) {
// string is immutable
		
		//a
		String s = "irise";   //point to lower case
		System.out.println(System.identityHashCode(s));
		
		//b
		s = s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		
		//c
		s = s.toLowerCase();
		System.out.println(System.identityHashCode(s));	
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	
	
	
	
	}

}
