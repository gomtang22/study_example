package constant_demo;

/*class Fruit{
	public static final Fruit APPLE =  new Fruit();
	public static final Fruit PEACH =  new Fruit();
	public static final Fruit BANANA =  new Fruit();
}
*/
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color; // enum �ȿ� ���� ���𰡴� 
	public String getColor() {  //enum �ȿ� �޼ҵ� ���𰡴� 
		return this.color;
	}
	Fruit(String color) {
		System.out.println("call constructor"+this);
		this.color = color;	
		System.out.println("call constructor"+this+this.color);
		}
}

/*
 * class Company{
 * 
 * public static final Company GOOGLE = new Company(); 
 * public static final Company APPLE = new Company(); 
 * public static final Company ORACLE = new  Company(); }
 */

enum Company{
	GOOGLE, APPLE, ORACLE
}


public class ConstantDemo {


	public static void main(String[] args) {
		
	//	if(Fruit.APPLE == Company.APPLE) {
	//		System.out.println("���Ͼ��ð� ��������� �����ϴ�");
	//	}		
		
	/*
	 * Fruit type = Fruit.APPLE; switch(type){ //switch���� ������ Ÿ�� - enum ��밡���� case
	 * APPLE: //����̸��� ������ ��
	 * System.out.println(57+" kcal, color : "+Fruit.APPLE.color); //������ ó�� break;
	 * case PEACH: System.out.println(34+" kcal, color : "+Fruit.PEACH.getColor());
	 * //�޼ҵ�� ó�� break; case BANANA:
	 * System.out.println(93+" kcal, color : "+Fruit.BANANA.color); break;
	 * 
	 * }
	 */
		
	for(Fruit f : Fruit.values()) {
		System.out.println(f);
	}
	}

}
