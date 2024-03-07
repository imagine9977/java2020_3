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
		System.out.println("확장자를 제외한 이름: " +fileName.substring(0,pos));
		System.out.println("확장자를 제외한 이름: " +fileName.substring(pos+1));
		System.out.println("경로 이름: " +f1.getAbsolutePath());
		System.out.println("확장자를 제외한 이름: " +f1.getParent());
	} 
	
}
