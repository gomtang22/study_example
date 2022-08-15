package Exception;


class DivdeException extends Exception {
	
	public int left;
	public int right;
	
	DivdeException(){
		super();  //기본생성자 
	}
	DivdeException(String message, int left, int right){
		super(message);   //기타 생성자 
		this.left = left ;
		this.right = right; 
	}
	
}
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public  String toString() {  //오버라이딩 
		return super.toString() + "* left : " + this.left + " * right : "+ this.right ;
		
	}
	public void devide() {
		try {if(right == 0) {
			throw new DivdeException("0으로 나눌수 없습니다.", this.left, this.right);
		}
		System.out.println(this.left/this.right);
		}
		catch(DivdeException e) {
			e.printStackTrace();
            System.out.println(e.left);
			System.out.println(e.right);
			
		}
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		System.out.println(c1);
		try {  c1.devide();
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
