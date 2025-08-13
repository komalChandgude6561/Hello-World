package P2;

public class ArithmeticConstructor {

	public int a;
	public int b;
	
	
public 	ArithmeticConstructor(int a,int b) {
	this.a = a;
	this.b = b;
	
}
//addition
public void printSum() {
	int sum = a+b;
	System.out.println(sum);
}

//subtraction
public void printSub() {
	int sub = a-b;
	System.out.println(sub);
}

//multiplication
public void printmul() {
	int mul= a*b;
	System.out.println(mul);
}

//divide
public void printdiv() {
	int div = a/b;
	System.out.println(div);
}
}
