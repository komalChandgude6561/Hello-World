package P2;

public class Demo {

	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		d.printSum();
		d.printSub();

	}
	
	public void printSum() {
		int a = 12;
		int b = 34;
		int sum = a+b;
		System.out.println(sum);
	}
	public void printSub() {
		int c = 45;
		int d = 23;
		int sub = c-d;
		System.out.println(sub);
	}

}
