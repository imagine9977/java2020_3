package rectangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class perimeter {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long square =  Integer.parseInt(bf.readLine()); //Long
		System.out.println(square*4);
		bf.close();
	}
}
