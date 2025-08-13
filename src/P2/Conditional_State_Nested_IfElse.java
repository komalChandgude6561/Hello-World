package P2;

public class Conditional_State_Nested_IfElse {

	public static void main(String[] args) {
          int Maths = 51;
          int Science = 51;
          int English = 51																				;
          int Age = 29;
          int TotalMarks = Maths+Science+English;
          //1. age>17
          //2every subject marks>50
          //3.total marks>160
          
          if (Age>17) {
        	  if(Maths>50 && Science>50 && English>50) {
        		  if(TotalMarks >=160) {
        			  
        			  System.out.println("Eligible for Addmission");
        				
        		  }
        		  else {
        			  System.out.println("not eligible due to total marks <=160");
        		  }
        	  }	
        	  else {
        		  if(Maths<50) {
        			  
        		  System.out.println("maths sub has less marks than 50");
            		  System.out.println("not eligible b coz one of sub has marks less than 50");

        		  }
        		  if(Science<50) {
            		  System.out.println("Science sub has less marks than 50");

        		  
            		  System.out.println("not eligible b coz one of sub has marks less than 50");

        		  }
        		  if(English<50) {
        			  
            		  System.out.println("English sub has less marks than 50");

        		  System.out.println("not eligible b coz one of sub has marks less than 50");
        	  }
        	  }}
        	  
		 
        	  
          else {
			
			 System.out.println(" Not eligible for Addmission");

          }
          
	
          
        
}}