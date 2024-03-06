package sec1;

public class CalcExam2 {
	public static void main(String[] args) {
		Calculator cal1;
		//cal1 = new Repeator() {
			
		//};
		
		cal1= new Arithmatic();
		//cal1은 calculator로 선언되어 있어서 calculator에 프린트가 없어서 실행 불가
		System.out.println("PI: "+cal1.PI);
	}
}
