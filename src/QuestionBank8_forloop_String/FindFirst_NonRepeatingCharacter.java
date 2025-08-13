package QuestionBank8_forloop_String;

public class FindFirst_NonRepeatingCharacter {

	public static void main(String[] args) {
          String name = "programmming";
 
          for(int i = 3; i<name.length() ; i++) {
        	  boolean unique = true;
        	  for(int j =3 ; j<name.length() ; j++) {
        		  if(i!=j && name.charAt(i)==name.charAt(j)) {
        			  unique = false;
        		  }
        	  }
         
          
          if(unique) {
        	  System.out.println("the first unique character is : "+name.charAt(i));
        	  break;
          }
          
          
          }
          
          
	}

}
