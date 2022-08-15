package constant_demo;

/*class Fruit{
	public static final Fruit APPLE =  new Fruit();
	public static final Fruit PEACH =  new Fruit();
	public static final Fruit BANANA =  new Fruit();
}
*/
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color; // enum 안에 변수 선언가능 
	public String getColor() {  //enum 안에 메소드 선언가능 
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
	//		System.out.println("과일애플과 기업애플은 같습니다");
	//	}		
		
	/*
	 * Fruit type = Fruit.APPLE; switch(type){ //switch에서 데이터 타입 - enum 사용가능함 case
	 * APPLE: //상수이름만 적으면 됨
	 * System.out.println(57+" kcal, color : "+Fruit.APPLE.color); //변수로 처리 break;
	 * case PEACH: System.out.println(34+" kcal, color : "+Fruit.PEACH.getColor());
	 * //메소드로 처리 break; case BANANA:
	 * System.out.println(93+" kcal, color : "+Fruit.BANANA.color); break;
	 * 
	 * }
	 */
		
	for(Fruit f : Fruit.values()) {
		System.out.println(f);
	}
	}

}
