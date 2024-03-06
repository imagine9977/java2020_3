package rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ThreeSticks {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		StringTokenizer st;
		int side1 , side2, side3;
		int max =0;
		st = new StringTokenizer(bf.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
		side1 = Integer.parseInt(st.nextToken()); //첫번째 호출
		side2 = Integer.parseInt(st.nextToken()); //두번째 호출
		side3 = Integer.parseInt(st.nextToken());
		max =side1;
		max = (max>side2) ? max:side2;
		max = (max>side3) ? max:side3;
		if((max)>=(side1+side2+side3-max)) {
			System.out.println((side1+side2+side3-max)*2-1);
		}else{
			System.out.println(side1+side2+side3);
		}
			
		
		bf.close();
		
	}

}
