package QuestionBank8_forloop_String;

public class Check_twoString_areAnagrams {
//using frequency count
	//anagram ex. arc-car, state-taste,night-thing
	//not complete
	public static void main(String[] args) {
		
		String name = "earth";
		String name1 = "heart";
		int frequency= 0;
		char ch =0;
		
		for(int i=0 ; i<name.length(); i++){
			
			for(int j =0 ; j<name1.length() ; j++) {
				
				if(name.charAt(i)==name1.charAt(j) && ch==name.charAt(i) && ch==name.charAt(j)) {
					frequency++;
	
			
		System.out.println("these two string anagrams" +frequency);
				}
				else {
					System.out.println("these two strings are not anagrams");
					break;
					
				}
			

	}}

}}
