package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = "장인범, 김민아, 김민석, 이희훈, 이예린, 이연정";
		String anis = "개의새끼 \f 소의새끼 \n 마의새끼 \t 꿩의새끼 \r";
		StringTokenizer st = new StringTokenizer(anis);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		StringTokenizer sk = new StringTokenizer(names,",");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken().trim());
		}
	}

}
