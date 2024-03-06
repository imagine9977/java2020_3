package sec1;

public class CalExam3 {
	public static void main(String[] args) {
		Repeator rep1;
		//rep1 = new Calculator();
		//안돼는 이유:자식 클래스로 선언된 객체는 부모 생성자로 생성할 수 없음
		
		//rep1 = new Repeator();
		//추상 클래스임으로 내부에 추상 메소드가 존재하고 있어
		//구현 내용이 없으므로 생성할 수 없음
		rep1 = new Arithmatic();
		
		System.out.println(rep1.multiply(3, 4));
		//rep1.print(); repeator에 선언되지 않은 함수니까 실행 안됨
		System.out.println(rep1.power(3, 4));
		System.out.println(rep1.divide(3, 0));
	}
}
