package sec2;

@FunctionalInterface
interface Lambda1 { // 매게변수 x 반환 x
	void method1();

}

@FunctionalInterface
interface Lambda2 { // 매게변수 o 반환 x
	void method2(int x, int y);
}

@FunctionalInterface
interface Lambda3 { // 매게변수 x 반환 o
	int method3();

}

@FunctionalInterface
interface Lambda4 { // 매게변수 o 반환 o
	int method4(int x, int y);

}

//Lambda: 메소드를 더 간소화한 표현식
public class LambdaExam {
	public static void main(String[] args) {
		/*
		 * Lambda1 f1 = new Lambda1() {
		 * 
		 * @Override public void method1() { // TODO Auto-generated method stub int x=
		 * 100; int y =100; System.out.println(x+y); }
		 * };
		 */
		// 하나의 인터페이스에는 하나의 함수만 가능
		Lambda1 f1 = () -> {
			int x = 100, u = 200;
			System.out.println(x + u);
		};
		f1.method1();
		
		Lambda2 f2 = (int x,int u) -> {
			System.out.println(x + u);
		};
		f2.method2(100,200);
		
		Lambda3 f3 = () -> {
			int x = 100, u = 200;
			return x+u;
		};
		System.out.println(f3.method3());
		
		Lambda4 f4= (int x,int u) -> {
			return x+u;
		};
		System.out.println(f4.method4(100,200));
	}
}
