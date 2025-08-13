package P2;

public class Demooo {

	public static void main(String[] args) {
		
		//student1
		Student1 student = new Student1();
		System.out.println(student.rollNo);
		student.getStudentName();
		
		//branch
		
		Branch branch = new Branch();
		branch.getBranch();
		
		//Grades
		 
		Grades grades = new Grades();
		System.out.println(grades.marks);
		grades.isPassedOrFailed();
		
		//Address
		
		Address address = new Address();
		address.getCompleteAddress();
		System.out.println(address.pinCode);
		
		
		
		
		
	}

}
