package P2;

public class Student_Static_Keyword {
	
	
	int id;
	String name;
	long phone ;
	String email;
	
	 static String college = "Irise Institute";
	 
	 
	 public Student_Static_Keyword(int id, String name , long phone , String email) {
		 this.id = id;
		 this.name = name;
		 this.phone = phone;
		 this.email = email;
	 }
		 public void displayInfo() {
			 
			 System.out.println(" id  : " +id);
			 
			 System.out.println(" name : "+name);
			 
			 System.out.println(" phone no  : "+phone);
			 
			 System.out.println("E-mail : " +email);
			 
			 System.out.println( "college : "+college);
			 
			 
			 
		 }
		 
	 }
	


