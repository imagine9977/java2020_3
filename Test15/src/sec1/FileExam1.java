package sec1;

import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		String file1 = "d:\\kim\\a.txt";
		File f1 = new File(file1);
	
		String fileName= f1.getName();
		System.out.println(fileName);
		int pos =fileName.lastIndexOf(".");
		System.out.println("Ȯ���ڸ� ������ �̸�: " +fileName.substring(0,pos));
		System.out.println("Ȯ���ڸ� ������ �̸�: " +fileName.substring(pos+1));
		System.out.println("��� �̸�: " +f1.getAbsolutePath());
		System.out.println("Ȯ���ڸ� ������ �̸�: " +f1.getParent());
	} 
	
}
