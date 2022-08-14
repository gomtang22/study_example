package overloading;

public class overloading2 {
	
	void A (String arg1, String arg2) {System.out.println("sub class : void " + arg1 + arg2);}
	void A (){System.out.println("sub class : void A ()");}
	
	public static void main(String[] args) {
		overloading2 od = new overloading2();
		od.A();
		//od.A(1);
		//.A("coding");
		od.A("coding","coding2");
	}
	
}
