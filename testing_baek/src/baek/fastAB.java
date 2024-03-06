package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class fastAB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st;
		int i = Integer.parseInt(bf.readLine()); //Int
		for(int j=0;j<i;j++) {
			st = new StringTokenizer(bf.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
			int a = Integer.parseInt(st.nextToken()); //첫번째 호출
			int b = Integer.parseInt(st.nextToken()); //두번째 호출
			bw.write((a+b)+"\n");
		}
		
		bw.close();
	}

}
