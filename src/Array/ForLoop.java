package Array;

public class ForLoop {

	public static void main(String[] args) {
		//homogeneous array---->collection of same datatype.
		
		int [] rollNo = {1,2,3,4,5};
		System.out.println(rollNo[1]);
		// in array we fix the length of array .redbus is a example of array we can book only limited seats.
		
		//hetero array --->collection of diff datatype.
		// Object class is a parent of class.Every class derived from Object class.
		//we can store all premitive and non primitive data type in Object[class]
		
	
		Object [] heteroArray = {12,"ss",23.45,false};
		System.out.println(heteroArray[3]);
		System.out.println("........................");

		int [] id = {11,12,13,14,15};
		for(int i= 0 ; i<id.length ; i++) {		
		System.out.println(id[i]);
	}
		
		Object[]data= {12,4.7,"abc",false};
		for(int i=0 ; i<data.length ; i++ ) {
		System.out.println(data[i]);
		}
}}
