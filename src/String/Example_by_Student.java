package String;

public class Example_by_Student {

	public static void main(String[] args) {
				String s = "irise";
				String s1 = "irise";
				
				// s==s1 :true
				//s.equals(s1):true
				
				System.out.println(System.identityHashCode(s));
				System.out.println(System.identityHashCode(s1));
				
				s =s.toUpperCase();
				s1 =s.toUpperCase();
				System.out.println(System.identityHashCode(s));
				System.out.println(System.identityHashCode(s1));
				
				System.out.println(s.equals(s1));
				System.out.println(s==s1);
				
				//s.equals(s1):true
				//s==s1:false
				



				
				
				
				
				
				
				
	}

}
