package polymorphism;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caculator c1 = new CaculatorDecoPlus();
       c1.setOprands(10,20);
       c1.run();
       
       Caculator c2 = new CaculatorDecoMinus();
       c2.setOprands(10,20);
       c2.run();
       
       
	}

}
