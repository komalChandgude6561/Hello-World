package method;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.printStudentName("vidya"));
System.out.println(s.printStudentAddress("NDA road ,warje, pune"));

System.out.println(s.printstudentPercentage(78.90f));

		Teacher t = new Teacher();
System.out.println(t.printTeacherName("Suyash"));
System.out.println(t.printTeacherAddress("Kothrud"));
	}

}
