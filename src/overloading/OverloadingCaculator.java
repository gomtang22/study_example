package overloading;

class CaculatorDemo {
    
	int left, right ; 
	int third = 0 ;
	
		public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left; 
		this.right = right;
	}

		public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left; 
		this.right = right;
		this.third = third; 
		
	}
	

}


public class OverloadingCaculator {
	
		public static void main(String[] args) {
			CaculatorDemo c1 = new CaculatorDemo();
			c1.setOprands(10,20);
			c1.setOprands(10,20,30);
		
		}
}

