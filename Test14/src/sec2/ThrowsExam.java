package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {
	public static void main(String[] args) throws IOException { //fileNotFoundException �ڿ� �Ⱥ��̴� ������ IOException�� ��¥�� �� ���� ������
																//���λ����� ���� �տ� ���ƾ� ���� ���� IOEƲ �ȿ� FILENOTFOUND
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
		String absolutePath = "D:\\kim\\java2\\test14\\bin\\sec2\\a.txt";
		String relativePath = "./a.txt"; //���� ���丮
		String relativePath2 = "../a.txt"; //���� ���丮 
		String relativePath3 = "../../a.txt"; //������ ���� ���丮 (test14)
		if(fis!=null) {
			fis.close();
		}
	}
}
