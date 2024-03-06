package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class idTriangleBySide {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		StringTokenizer st;
		int side1 , side2, side3;
		int max =0;
		while(true) {
			st = new StringTokenizer(bf.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
			side1 = Integer.parseInt(st.nextToken()); //첫번째 호출
			side2 = Integer.parseInt(st.nextToken()); //두번째 호출
			side3 = Integer.parseInt(st.nextToken());
			if(side1==0&&side2==0&&side1==0) break;
			max =side1;
			max = (max>side2) ? max:side2;
			max = (max>side3) ? max:side3;
			if((max)>=(side1+side2+side3-max)) {
				System.out.println("Invalid");
			}else{
				if(side1==side2&&side2==side3) {
					System.out.println("Equilateral");
				}else if(side1==side2||side2==side3||side1==side3) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}
		}
		bf.close();
		
	}
}
