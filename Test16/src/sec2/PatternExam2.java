package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern: Ư�������Ͱ� ������ �´��� ���Ϸ��� �� ��� ������ ������ �����ϴ� Ŭ����
//Matcher: Ư�������� ���°� �´��� ���ϴ� Ŭ����
//���Խ�(reg expression =>regex)
public class PatternExam2 {
	public static void main(String[] args) {

		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\=\\d{2}");
		String[] post = { "234-123", "321-132", "12-392", "4213-32", "493-32" };
		for (int i = 0; i < post.length; i++) {
			Matcher m = p4.matcher(post[i]);
			if (m.matches()) {
				System.out.println("�´� �����ȣ�Դϴ�");
				System.out.println(post[i]);
			}
		}
		
		//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$
		String[] pw = { "abXCd123", "A123e", "1234", "ABCD!", "KIM#1942", "K2sM#1942" };
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");
		for (int i = 0; i < pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
			if (m.matches()) {
				System.out.println("It matches!: "+pw[i]);
			}
		}

	}
}
