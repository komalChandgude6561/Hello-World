package QuestionBank5_loops;

public class Pallindrome_orNot {

	public static void main(String[] args) {

		int t = 143;
		int reverse=0;
		while(t>0) {
			 t =t/10;
			int r = t/10;
		 reverse = reverse*10+r;
		}
		 System.out.println("reverse of given no is " + reverse);
		 if(143==reverse) {
			 System.out.println("no is pallindrome");
		 }
		 else {
			 System.out.println("no is not pallindrome");
		 }

	}
	}

