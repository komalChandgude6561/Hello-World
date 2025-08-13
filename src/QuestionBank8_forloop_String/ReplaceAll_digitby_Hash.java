package QuestionBank8_forloop_String;



public class ReplaceAll_digitby_Hash {

	public static void main(String[] args) {

		String pincode= "413130";
		String newString = "";
		
		for( int i=0 ; i<pincode.length() ; i++) {
			
			char ch = pincode.charAt(i);
		
			if(ch=='0' || ch == '1'||ch=='2' || ch=='3'||ch=='4'|| ch== '5'|| ch== '6' || ch== '7' || ch=='8'|| ch=='9') {
				 newString += "#";
				 
		}
			else {
				newString += pincode.charAt(i);
			
			}
			}
		System.out.println("original String: "+ pincode);
		System.out.println("new String: "+newString);
		
		 

}
}
