package overloading;

abstract class Caculator{
	
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left ; 
		this.right = right ; 
	}
	
	
	 int _sum() {
		return this.left + this.right;
	}
	
	 int _avg() {
		return (this.left+this.right)/2;
	}
	
	
	public abstract void sum();

	public abstract void avg();

	public void run() {
		
		sum();
		avg();
	}
	
}

   
class CaculatorDecoPlus extends Caculator {
	
	public void sum() {
		System.out.println("+ sum :"+ _sum());
	}
	
	public void avg() {
		System.out.println("+ avg :"+ _avg() );
	}
	
}


class Cacu latorDecoMinus extends Caculator {
	
	public void sum() {
		System.out.println("-sum"+ _sum());
		
	}

	public void avg() {
		System.out.println("-avg"+ _avg() );
		
	}


}
   


public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaculatorDecoPlus c1 = new CaculatorDecoPlus();
		c1.setOprands(10,20);
		c1.run();
		
		CaculatorDecoMinus c2 = new CaculatorDecoMinus();
		c2.setOprands(10,20);
		c2.run();
	}

}
