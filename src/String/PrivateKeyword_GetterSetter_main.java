package String;

public class PrivateKeyword_GetterSetter_main {

	public static void main(String[] args) {

		
		PrivateKeyword_GetterSetter p = new PrivateKeyword_GetterSetter();
		
		//value set
		p.setName("tiger");
		p.setName("Elephant");
		//here value tiger is overirde by elephant 
		
		//value get
		System.out.println(p.getName());
	}

}
