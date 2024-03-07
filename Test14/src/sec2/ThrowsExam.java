package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {
	public static void main(String[] args) throws IOException { //fileNotFoundException 뒤에 안붙이는 이유가 IOException이 어짜피 더 빨리 반응함
																//세부사항을 먼저 앞에 놓아야 먼저 반응 IOE틀 안에 FILENOTFOUND
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
		String absolutePath = "D:\\kim\\java2\\test14\\bin\\sec2\\a.txt";
		String relativePath = "./a.txt"; //현재 디렉토리
		String relativePath2 = "../a.txt"; //상위 디렉토리 
		String relativePath3 = "../../a.txt"; //상위의 상위 디렉토리 (test14)
		if(fis!=null) {
			fis.close();
		}
	}
}
