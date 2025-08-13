package P2;

public class Datatypes {

	public static void main(String[] args) {
		int age =21;
		String s = "Irise Institute $$$$$";
		//int phoneNumber = 9673008080; int num is too large
		long phoneNumber = 9673008080l;
		long amount = 123456789987654321l;
		System.out.println(age);
		System.out.println(s);
		System.out.println(phoneNumber);
		
		//.....................................................
		//create variables of different datatypes
		 
		int items = 50;
		float costPerItem = 9.99f;
		float totalCost = items*costPerItem;
		char currency = '$';
		System.out.println("No of items = "+ items);
		System.out.println("Cost per item = "+ costPerItem+currency);
		System.out.println("total cost = "+ totalCost+currency);
		
		//conversion int into double
				int num = 128;
				double d = num;
				System.out.println(d);
			//conversion int into float
				float f = num;
				System.out.println(f);
			//conversion int into byte
				byte b = (byte) num;
				System.out.println(b);
				//conversion int into long
				long L = (long) num;
				System.out.println(L);
				
				
				
				//implicit conversion
				int num1 = 5004;
				double num2 = 2.45;
				double sum = num1+num2;
				System.out.println(sum);
				
				//explicit conversion
				int a = 34;
				float F = (float) a;
				System.out.println(F);
				
				int x = 1234567896;
				long l = (long) x;
				System.out.println(l);
				
				
				
			
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

		
		

	}

