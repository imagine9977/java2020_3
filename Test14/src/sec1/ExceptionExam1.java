package sec1;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String data = null;
		String name = "낌기태";
		//System.out.println("data:"+data);
		System.out.println("name:"+name);
		try {
			System.out.println(data.toString());
		}catch (Exception e) {
			System.out.println("알 수 없는 오류 발생");
		}
	}
}
