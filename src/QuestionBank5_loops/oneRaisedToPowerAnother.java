package QuestionBank5_loops;

public class oneRaisedToPowerAnother {
	
	
static int power(int n , int p) {
	int pow = 1;
	for(int i=1 ; i<=p ;i++) {  
		pow*= n;		
	}
		return pow;
	}

	public static void main(String[] args) {
	    	int n = 3;
		int p =4;
		System.out.println(power(n,p));
}}
	
//	public static void main(String [] args) {
//
//int power = 1;
// 
//		
//for(int a =1 ;a<=10 ; a++) {
//	int n = 1;
//	
//	power*= a;
//	System.out.println(power);
//	
//}
	

	