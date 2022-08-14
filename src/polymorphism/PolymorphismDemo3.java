package polymorphism;


interface I2{
	public String A();
}


interface I3{
	public String B();
}

class D implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}


public class PolymorphismDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         D obj = new D();  //D라는 클래스를 obj라는 변수로 인스턴스화함.(obj는 D클래스 타입임) 
         I2 objI2 = new D(); // 클래스중 인터페이스 하나를 구현
         I3 objI3 = new D();
         
         
         
         obj.A();
         obj.B();
         
         objI2.A();
        // objI2.B();
         
       //  objI3.A();
         objI3.B();
         
         
         
	}

}
