package sec1;

public class ExceptionExam3 {
	public static void main(String[] args) {
		int[] nArr = {90,85,100};
		int i = 0;
		while(i<=3) {
			try {
			System.out.println(nArr[i]);
			i++;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				break;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("작업종료"); //성공하든 실패하든 무조건 나옴
			}
		}
	}
}
