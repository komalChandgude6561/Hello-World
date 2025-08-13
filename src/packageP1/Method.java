package packageP1;

public class Method {
	
	public void myMethod() {
		System.out.println("i just gotexecuted!");
	}


	public static void main(String[] args) {
		System.out.println("i am in main method");
		Method m = new Method();
		
		m.getName();
		m.myMethod();
		
		
		

	}
	public void getName() {
		String Name = "komal ";
		String middleName = "Mayur ";
		String lastName = "Chandgude ";
		String FullName;
		System.out.println("FullName is : "+Name+middleName+lastName);
	}

}
