package sec1;

public abstract class Repeator implements Calculator {
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public abstract int power(int num1, int num2);
}
