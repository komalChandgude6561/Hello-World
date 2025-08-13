package P2;

public class Para_returnType_Method2 {



	public static void main(String[] args) {

		Para_returnType_Method p = new Para_returnType_Method();
		p.getName("irise Classes");
	
	
	int s= p.getShare(100000);
	System.out.println(s);
	
	String updatedName = p.getUpdatedName("komal");
	System.out.println(updatedName);
	
	float f = p.printPercentage(430);
	System.out.println(f);
	
	int no = p.getAsciiValue('K');
	System.out.println(no);
	
	
	
	


}
}