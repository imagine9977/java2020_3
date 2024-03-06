package sec1;

public class CalculatorExam {
	public static void main(String[] args) {
		Arithmatic a1 = new Arithmatic();
		System.out.println(a1.multiply(5, 4));
		System.out.println(a1.multiply(3, 4));
		a1.print();
		System.out.println(a1.power(3, 4));
		System.out.println(a1.divide(3, 0));
	}
}
