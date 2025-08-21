package method;

public class StudentDetails_byStaticMethod {
	
	static int id =101;
	static String name="vidya";
	static float percentage = 87;
	
	static String printStudentDetails() {
		System.out.println(id);
		 
		 System.out.println(percentage);
		 return name;
	}
	
	

	public static void main(String[] args) {
		printStudentDetails();
		System.out.println(StudentDetails_byStaticMethod.name);
		
	

	}

}
