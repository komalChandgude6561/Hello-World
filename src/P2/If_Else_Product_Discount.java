package P2;

public class If_Else_Product_Discount {

	public static void main(String[] args) {
            /* product category Discount
             * 
             *Electronics: 10% discount.
             * 
             * Clothing : 15% discount, but 20% if the purchase amount is over 5000.
             * 
             * Food: no discount , unless the purchase amount is  over 1000 , then 5% discount.
             */
	
String Category = "Clothing";
double purchaseAmount = 1000;


	if("Electronic".equals(Category)) {
		System.out.println(" u got a 10% discount");
	}
	else if("Clothing".equals(Category)){
if(purchaseAmount>5000) {
		System.out.println("u got a 20% discount.");
	}
	else {
		System.out.println("u got 15% discount.");
	}
	
	}else if("Food".equals(Category)) {
		if (purchaseAmount>1000) {
			System.out.println("u got 5 % discount.");
		}
		else {
			System.out.println("No discount");
		}
	}
  }
}


