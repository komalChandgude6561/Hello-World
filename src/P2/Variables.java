package P2;

public class Variables {
	
	public int rollNo = 101;  //global variable
	public String s = "sujata";   //global variable
	public double d = 24.67d;
	

	public static void main(String[] args) {
		
	
		 int age = 13;      //local variable
		 String name = "kavita";   //local variable
		 float b = 23.45f;
		 System.out.println(age);
		 System.out.println(name);
		 System.out.println(b);
		 
		 //global variable sathi object create krava lagto.
		 
		 Variables v = new Variables();  //object creation
		 System.out.println(v.rollNo);   //object creation
		 System.out.println(v.s);    //object creation
		 System.out.println(v.d);
		 
		 
		 

	}

}
