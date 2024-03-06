package sec1;

public class Arithmatic extends Repeator {

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2==0) return ERROR;
		return num1/num2;
	}
	
	@Override
	public int power(int num1, int num2) {
		int num3 =num1;
		if (num2==0) return 1;
		for(int i=1; i<num2;i++) {
			num1 *=num3;
		}
		return num1;
	}

	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}

}
