package sec1;

public class ExceptionExam4 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "김기태";
		int val1, val2;
		try {
			val1 = Integer.parseInt(data1);
			val2 = Integer.parseInt(data2);
			System.out.println(val1);
			System.out.println(val2);
		} catch (NumberFormatException e) {
			System.out.println("숫자아님");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.getMessage();
		} finally {

			System.out.println("종료");
		}
	}
}
