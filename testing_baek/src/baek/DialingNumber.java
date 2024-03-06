package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DialingNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int total =0;
		String str = st.nextToken();
		//System.out.println(str);
		for(int i =0; i<str.length();i++) {
			char x = str.charAt(i);
			if(x=='A'||x=='B'||x=='C') total+=3;
			else if(x=='D'||x=='E'||x=='F') total+=4;
			else if(x=='G'||x=='H'||x=='I') total+=5;
			else if(x=='J'||x=='K'||x=='L') total+=6;
			else if(x=='M'||x=='N'||x=='O') total+=7;
			else if(x=='P'||x=='Q'||x=='R'||x=='S') total+=8;
			else if(x=='T'||x=='U'||x=='V') total+=9;
			else total+=10;			
					
		}
		System.out.println(total);
		
		
		
	}
}
