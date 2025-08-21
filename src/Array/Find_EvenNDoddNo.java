package Array;

public class Find_EvenNDoddNo {

	public static void main(String[] args) {

		String [] str = {"happy" , "birthday" ,"to" ,"you"};
		for(int i =0 ; i<str.length ; i=i+2) {
			System.out.println(str[i]);    //it takes only even index value i.e (happy ,to )
			
		}
		System.out.println(".................");
		
		for(int i = 1 ; i<str.length ; i=i+2) {
			System.out.println(str[i]);  //it takes only odd index
			
		}
	}

}
