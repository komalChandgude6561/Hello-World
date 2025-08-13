package practice;

public class Demo_Sudent_Address_Grades_Branch {

	public static void main(String[] args) {
		
		//Student class
		//object creation b.cz.int rollNo is a global variable
		
		Sudent_Address_Grades_Branch_Demo s = new Sudent_Address_Grades_Branch_Demo();
		System.out.println(s.rollNo);
		
		//method call
		s.getStudentName();
		
		//..................................................
		
		//branch class
		Branch__Student_Address_Grades_Demo b = new Branch__Student_Address_Grades_Demo();
		b.getBranch();
		
		//...............................................................
		
		//grades class
		//object creation b.cz. int marks is global variable
		
		Grades_Branch_Student_Address_Demo g = new Grades_Branch_Student_Address_Demo();
		System.out.println(g.marks);
		g.isPassedOrFailed();
		
		//............................................................
		
		//Address class
		//object creation b.cz. int pincode is global variable
		
		Address_Student_Grades_Branch_Demo a = new Address_Student_Grades_Branch_Demo();
		a.getCompleteAddress();
		System.out.println(a.pincode);
		
		/*que : student,address,grades,branch,demo he class create krayche. pn ekch object demo class mdhy create kraycha.
		ans: student cha object demo mdhy create kraycha nantr bakiche object aapn kontya class che kontyapn class mdhy kru shkto.(hint: ek class mdhy nahi bnvaycha object)it means dependancy create kraychi .flow maintain kraycha. */
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
