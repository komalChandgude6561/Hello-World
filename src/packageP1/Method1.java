package packageP1;

public class Method1 {
	
	public void Addition() {
		int x = 5;
		int y = 34;
		int Addition = x+y;
		System.out.println(Addition);
	}
	
	
	public void Employee() {
		int Id = 101;
		int rollNo = 23;
		String Name = "komal";
		System.out.println("Info of Empoyee is :"+ " Id:"+ Id + " rollNo :"+ rollNo +" Name: "+ Name);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Method1 a = new Method1();
		a.Addition();
		a.Substraction();
		a.Employee();
	

	}
	
	
	
	public void Substraction() {
		int b = 45;
		int c = 13;
		 int Substraction =  b-c;
		System.out.println(Substraction);
	}

}
