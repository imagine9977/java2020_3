package sec1;

public class CalExam4 {
	public static void main(String[] args) {
		int num1 =100;
		int num2 =3;
		Calculator cal1;
		//cal1 = new Calculator(); 실행 안됨
		cal1 = new Calculator() {
			public int add(int num1, int num2) {
				return num1+num2;
			}
			
			public int subtract(int num1, int num2) {
				return num1-num2;
			}
			public int multiply(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1*num2;
			}

			public int divide(int num1, int num2) {
				// TODO Auto-generated method stub
				if (num2==0) return ERROR;
				return num1/num2;
			}
			
			
		};
		
		System.out.println(cal1.add(3, 4));
	}
}
