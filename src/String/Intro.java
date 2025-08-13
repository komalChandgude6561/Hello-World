package String;

public class Intro {

	public static void main(String[] args) {
		
		
          String s = "Irise Institue";
          System.out.println(s.length());
          System.out.println(s.toLowerCase());
          System.out.println(s.toUpperCase());
           
          char c = s.charAt(1);
          System.out.println(c);
          
          System.out.println(s.concat(" PUNE"));
          
          System.out.println(s.endsWith("e"));
          System.out.println(s.startsWith("i"));
          
          int i = s.indexOf('I');
          System.out.println(i);
          System.out.println(s.contains("hello"));
          
          System.out.println(s.isEmpty());

	
	}

}
