package method;

public class Static_Method {
	
	static int Age;
	static int id= 102;
	
	static String printName(String name) {
		Age =23;
		System.out.println(name);
		return name;
		
	}
	
	static void printAddress() {
		String Address = "NDA road ,warje , pune";
		System.out.println("Address is :  "+Address);
	}

	public static void main(String[] args) {
	System.out.println(Static_Method.id);
		printName("kavita");
		System.out.println("age is : "+Static_Method.Age);
		printAddress();

	}

}
