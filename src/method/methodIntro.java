package method;

public class methodIntro {
	int v =13;
	public static void main(String[] args) {
		Integer a =15;
		System.out.println(a);
		System.out.println("in main method");
		methodIntro m = new methodIntro();
		m.getName();
		m.printSub();
	}
		
		
		
public void getName() { 
	int sum =0;
	int a =10;
	int b= 30;
	sum = a+b;
	System.out.println(sum);
System.out.println("i am in getName method");
}

public void printSub() {
	int a =10 ;
    int sub = 0;
	int b= 87;
	sub= b-a;
	System.out.println(sub);
	
}


}
