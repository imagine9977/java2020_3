package sec3;

class RunException extends Exception {
	public RunException() {
	}

	public RunException(String msg) {
		System.out.println("msg: " + msg + " ��������ǿ��� �߻�");
	}
}

public class UserExceptionExam1 {
	public static void main(String[] args) {
		try {
			method1();
		}catch(RunException e) {
			e.printStackTrace();
		}
	}



	public static void method1() throws RunException{
		// TODO Auto-generated method stub
		throw new RunException("����� ����");
	}
}
