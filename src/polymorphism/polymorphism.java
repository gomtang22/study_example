package polymorphism;

class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

class A{
	public String x() {return "a.x";}
}


class B extends A{
	public String y() {return "y";}
    public String x() {return "B.x";}
}

class B2 extends A{
	public String x() {return "B2.x";}
}



public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A obj = new B();
       A obj2 = new B2();
      // System.out.println(obj.y());  
       System.out.println(obj.x());
       System.out.println(obj2.x());
       
	}

}
