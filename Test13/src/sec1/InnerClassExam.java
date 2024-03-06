package sec1;

class Outer{
	private int num = 10;
	private static int sNum = 20; //정적 멤버 필드
	private Inner inner;
	public Outer(){
		inner = new Inner();
		
	}
	class Inner{ //내부 클래스
		int inNum = 1000;
		void inMethod() {
			System.out.println("내부 num "+num);
			System.out.println("내부 sNum "+sNum);
		}
	}
	public void outMethod() {
		inner.inMethod();
		
	}
} 



public class InnerClassExam {
	public static void main(String[] args) {
		
	}
}
