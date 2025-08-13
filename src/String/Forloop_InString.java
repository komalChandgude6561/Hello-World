package String;

public class Forloop_InString {

	public static void main(String[] args) {

		String day = "monday";
		//System.out.println(day);
		int length = day.length();
		System.out.println(length);
		
		for(int i=0; i<day.length(); i++) {
			//vowels and consanat
			
			if(day.charAt(i)!='a' && day.charAt(i)!='o'&& day.charAt(i)!='e' && day.charAt(i)!='i') {
				System.out.println(day.charAt(i));
			}
			
			

			// char at on even index 
			
//			if(i%2==0) {
//				
//			
//			//char c = day.charAt(i);
//			System.out.println(day.charAt(i));
//		}
	}
	}

}
