package practice;

public class Method {
	
	int emp_id = 101;
	String emp_name = "Michel";

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("End");
		
		//method call 
		Method m  = new Method();
		m.getName();
		m.getAge();
		
		//to print global variable
		System.out.println(m.emp_id);
System.out.println(m.emp_name);
		
		


	}
	
	public void getName() {
		System.out.println("i'm in getName");

	}
	
	public void getAge() {
		System.out.println("i'm 29 years old now!");
	}

}
