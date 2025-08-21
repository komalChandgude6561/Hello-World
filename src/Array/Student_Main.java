package Array;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {

		//primitive and non primitive
		Student s = new Student();
		s.setId(101);
		s.setName("gnesh");
		s.setCity("mumbai");
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("geeta");
		s1.setCity("pune");
		
		Student s2 = new Student();
		s2.setId(103);
		s2.setName("shirish");
		s2.setCity("Delhi");
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("gnesh");
		s3.setCity("banglore");
		Student [] studentArray = {s,s1,s2,s3};
		
		
		//for replace data
		//studentArray[2]= s3;
		
		//find student who is from pune

		Scanner sc = new Scanner(System.in);
		System.out.println("enter city:");
		String city = sc.next();
		
		
		for(int i = 0 ; i < studentArray.length ; i++) {
			
			if(studentArray[i].getCity().equals(city)) {
			//System.out.println(studentArray[i]);
		//	Student studentfromArray = studentArray[i];
			System.out.println(studentArray[i].getId());
			System.out.println(studentArray[i].getName());
			System.out.println(studentArray[i].getCity());
		}
		
	
	}

	}}
