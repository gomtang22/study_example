package Exception;

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void devide() {
		//계산결과는 오류가 발생했습니다 :/ by zero
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다. ");				
		} catch(Exception e) {
			/*
				e.getMessage()
				/ by zero
				
				
				e.toString()
				java.lang.ArithmeticException: / by zero
				
				
				e.printStackTrace()
				java.lang.ArithmeticException: / by zero
					at Exception.Calculator.devide(CalculatorDemo.java:14)
					at Exception.CalculatorDemo.main(CalculatorDemo.java:32)
			 
			 */
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		c1.devide();
	}

}
