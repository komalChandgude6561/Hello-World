package method;

public class public_vs_StaticMethod {
	
	
	
	public void printAdd() {
		int a = 65;
		int b = 34;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void printsum() {
		int a =10;
		int b = 43;
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		printsum();      //Static method call
	//	printAdd();    ....it gives error b.cz public method only call when object is created
		
		public_vs_StaticMethod p = new public_vs_StaticMethod();
		p.printAdd();
	}

}
