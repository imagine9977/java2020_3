package sec3;
//�ڵ� �ν����
//PMD:�ڵ� �ν���� ����
//�ϴ� ����: ���Ǵ� ����, ���� �߻� ���ɼ� �ּ�ȭ
//�̸�		�ɺ�		���ȵ��		�ڸ�Ʈ
//Blocker	red		high		mandatory, memory leak or error probability is high
//Critical
//Urgent
//Important
//Warning
public class CodeInspectionExam {
	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"https://naver.com","���̹�", 1);
		r1.def = "���� ������";
		System.out.println(r2.toString());
		System.out.println(r2.def);
	}
}
