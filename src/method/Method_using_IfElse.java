package method;

public class Method_using_IfElse {
	//voting criteria
	int age =13;
	public void CheckAge() {
		if(age<18) {
			System.out.println("you are not eligible ");
		}
		else if(age>18){
			System.out.println("you are eligible");
		}
	}
	
	

	public static void main(String[] args) {
		
		Method_using_IfElse m = new Method_using_IfElse();
		m.CheckAge();
	}

}
