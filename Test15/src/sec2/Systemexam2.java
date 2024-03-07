package sec2;

import java.io.IOException;

public class Systemexam2 {
	public static void main(String[] args) throws IOException{
		System.out.println();
		int i;
		String data = "";
		try {
			while((i=System.in.read())!='\n') {
				System.out.println((char) i);
				data +=(char) i;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);
	}
}
