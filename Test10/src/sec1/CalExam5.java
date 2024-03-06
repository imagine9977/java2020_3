package sec1;

public class CalExam5 {
	public static void main(String[] args) {
		int num1 =100;
		int num2 =3;
		Repeator rep1;
		rep1 = new Repeator() {
			
			public int multiply(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1*num2;
			}

			public int divide(int num1, int num2) {
				// TODO Auto-generated method stub
				if (num2==0) return ERROR;
				return num1/num2;
			}

			@Override
			public int power(int num1, int num2) {
				
				return (int) Math.pow(num1, num2);
			}
		};
		
		
		System.out.println(rep1.add(3, 4));
		System.out.println(rep1.subtract(5, 4));
		System.out.println(rep1.multiply(3, 4));
		System.out.println(rep1.power(3, 4));
		System.out.println(rep1.divide(4, 2));
		
	}
}
