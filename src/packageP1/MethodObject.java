package packageP1;

public class MethodObject {
	
	public void Multiplication() {
		int a = 45;
		int b = 23;
		int mul = a*b;
		System.out.println(mul);
	}
	public void Addition() {
		int c = 23;
		int d = 78;
		int add = c+d;
		System.out.println(add);
	}
	
	public static void Substraction() {
		int  e = 97;
		int f = 47;
		int sub = e-f;
		System.out.println(sub);
		
	}
	
	public void divide() {
		int  g = 45;
		int h = 5;
		int div = g/h;
		System.out.println(div);
		
	}

	

	public static void main(String[] args) {
		
		
		MethodObject m = new MethodObject();
		m.getInfo();
		
		m.divide();
		m.Substraction();
		m.Addition();
		m.Multiplication();
		
		

		
	
		
			
		

	}
	
	
	public void getInfo() {
		int employeeId = 23;
		String name = "john Doe";
		float salary = 23456;
		System.out.println("employeeInfo : "+ employeeId+ name +salary);
		
	}

}
