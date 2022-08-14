package polymorphism;

abstract class Caculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left ; 
		this.right = right;
	}
	
	int _sum() {
		   return this.left + this.right ;
	   }

	   public abstract void sum();
	   public abstract void avg();
	   public void run() {
		   sum();
		   avg();
	   }
}

 


public class CalculatorDemo {
 
	public static void execute(Caculator cal) {
	 System.out.println("실행결과");
	 cal.run();
 }
	
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

