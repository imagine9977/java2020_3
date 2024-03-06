package baek;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
//while 문제가 아닌 공식으로 푸는 문제
public class snail_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		int day =1;	
		day = (height -down)/(up-down);
		if(((height -down)%(up-down))!=0) day++;
		System.out.println(day);
		br.close();
	}
}
