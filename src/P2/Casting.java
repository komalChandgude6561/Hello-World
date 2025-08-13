package P2;

public class Casting {

	public static void main(String[] args) {
		//implicit casting( no data loss) 
		int a = 12;
		double b = a;
		System.out.println(b);
		int k = 25;
		double d = k;
		System.out.println(d);
		
		//explicit casting(data loss)
		double c = 123.456;
		int result = (int) c ;
		System.out.println(result);

	}

}
