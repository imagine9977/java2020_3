package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExam {
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		if (f1.createNewFile()) {

		} else {

		}
		String data = "Hello data";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes());
		fos.close();
	}
}
