package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinalExceptionExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}finally {
		if(fis!=null) {
			try {
				fis.close();
			}catch(){
				
			}
		}
	}
}
