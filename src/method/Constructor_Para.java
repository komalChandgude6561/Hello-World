package method;

public class Constructor_Para {
	int Currentdate;
	int Currentmonth;
	int Currentyear;
	public Constructor_Para(int date , int month , int year) {
		this.Currentdate = date;
		this.Currentmonth = month;
		this.Currentyear =year;
	}

	public static void main(String[] args) {
		
		Constructor_Para c = new Constructor_Para(17,02,1996);
		System.out.println("Current date is : " +c.Currentdate+"/"+c.Currentmonth+"/"+c.Currentyear);
		

	}

}
