package QuestionBank3_IfElse_Nested_IfElse;

public class ATM_Withdrawal {

	public static void main(String[] args) {

		
		int balance = 100000;
		int withdrawalAmount = 500000;
		
		if(withdrawalAmount%100==0  &&  withdrawalAmount<=balance) {
			System.out.println("approve");
			
		}
		else  {
			System.out.println("reject");
		}
	}

}
