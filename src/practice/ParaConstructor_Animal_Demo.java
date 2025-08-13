package practice;

public class ParaConstructor_Animal_Demo {
	public int age;
	public int pincode;
	//public int studentAge;
	// studentAge variable public kelyamule object create kraychi grj nahi
	
	/* parameterised constructor body...para.constructr used to local variable chi value global variable la assign krnyasathi */

	public ParaConstructor_Animal_Demo(int age, int pincode) {
		//studentAge = age;
		this.age = age;
		this.pincode = pincode;
		//this.age is global variable and age is local variable
		
		
	}
	
	public void getDetails() {
		//System.out.println(studentAge);
		System.out.println(age);
		System.out.println(pincode);
	}
	

}
