package sec3;

class RunException extends Exception {
	public RunException() {
	}

	public RunException(String msg) {
		System.out.println("msg: " + msg + " 사용자정의예외 발생");
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
		throw new RunException("사용자 예외");
	}
}
