package Page311;

public class Bus {
	public final static int LIMIT = 2; //상속 불가능한 변경 불가능
	public  static int MAX = 100;  //상속 가능한 변경 가능
	public final void method1() { //오버라이딩 불가능
		System.out.println("Bus method1");
	}
	
	public void method2() {
		System.out.println("Bus method2");
	}
}
