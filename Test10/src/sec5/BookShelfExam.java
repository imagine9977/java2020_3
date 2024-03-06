package sec5;

public class BookShelfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que = new BookShelf();
		que.enQueue("과수원");
		que.enQueue("과학관");
		que.enQueue("동물원");
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}
