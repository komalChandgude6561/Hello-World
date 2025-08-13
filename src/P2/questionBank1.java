package P2;


//que.1 and 2 combination ----Declare and initialize  all 8 primitive datatypes and store them in wrapper class and print those an object

public class questionBank1 {
	

	public static void main(String[] args) {
		Integer a = 14;
		Short b = 12345;
		Long c = 1234567890987654321l;
		Float X = 23.45f;
		Double d = 123.56d;
		Boolean e = false;
		Byte g = 1;
		Character ch = 'A';
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(X);
		System.out.println(e);
		System.out.println(g);
		System.out.println(ch);
		
//que3. convert following datatype into provided other datatype .write complete code in one class.
		
		//byte to short
		byte A = 44;
		short B = A;
	
		System.out.println(B);
		//its o/p gives 44 value or same value.
		
		//short to char
		
		short S = 12;
		char c1 = (char)S;
		System.out.println(c1);
		
		
		//char to int 
		
		char D = 'K';
		int O = D;
		System.out.println(O);
		
		//int into long
		
		int S1 =6;
		long L = S1;
		System.out.println(L);
		
		//long to float
		
		long l = 1234560l;
		float F = l;
		System.out.println(F);
		
		
		//float to double
		
		float U = 45.234f;
		double p = U;
		System.out.println(p);
		
		
//que4 convert following datatype into provided other datatype .write complete code in one class.
		
		//short to byte
		short t = 12388;
		byte E = (byte)t;
        System.out.println(E);
        
        //char to short
        char q = 'J';
        short l1 = (short)q;
        System.out.println(l1);
        
        //int to char
        int Y = 98;
        char M = (char)Y;
        System.out.println(M);
        
        //long to int 
        long h = 23467898754321l;
        int N = (int) h;
        System.out.println(N);
        
        //float to long
        float G = 345123.6f;
        long Z = (long)G;
        System.out.println(Z);
        
        //double to float 
        double C= 87.2;
        float v = (float)C;
        System.out.println(v);
        
//que5 Write a java program to convert temp.from fahrenheit to celcius degree
        //(hint: 212.0 degree fahrenheit is equal to 100.0 in celsius.
        double f = 80f;
        double w = (f-32)*5/9;
        System.out.println("conversion of temp from : "+w);
        
     


        
        
        
        



                
		
		



		
		
		
		


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
