package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam8 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("indata.txt");
			try {

				ois = new FileOutputStream("outdata.txt");
			} catch (FileNotFoundException f) { //exception 변수는 똑같으면 안됨 
				System.out.println("ois 파일 못 찾음");
			} catch (Exception f) {
				System.out.println("원인불명");
				f.printStackTrace();
			} finally {
				System.out.println("파일처리 종료");
			}
		} catch (FileNotFoundException e) {
			System.out.println("fis 파일 못 찾음");
		} catch (Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		} finally {
			System.out.println("파일처리 종료");
		}
	}
}
