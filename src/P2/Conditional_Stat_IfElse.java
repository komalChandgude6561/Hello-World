package P2;

public class Conditional_Stat_IfElse {

	public static void main(String[] args) {
		
		int age = 56;
		boolean isWeekend = true;
		
//.Ticket pricing :
		
		/*1.children(under 13 years): rs 100 on weekdays
		120 on weekends.
		
		/2.Adult(13 to 64 years) rs 150 on weekdays
		 * 180 on weekends 
		
		 /3.Seniors(65 and above) : rs 130 on weekdays 
		  150 on weekends
		 		 */
		
		
		
		if(age<13) {
			if(isWeekend) {
				System.out.println("ticket price is : 120");
				
			}
			
			else {
				System.out.println("Ticket price is : 100");
			}
			
			
			
			if (age<=64) {
				if(isWeekend) {
					System.out.println("ticket price is :180 ");

				}
				else {
					
					
					System.out.println("ticket price is :150 ");

				}
			
			}
		
		if(age>=65) {
			if(isWeekend) {
			System.out.println("ticket price is :130 ");

		}
			else {
				System.out.println("ticket price is :150 ");

			}
		
		
		
		}
		
		}
		
		
	}

}
