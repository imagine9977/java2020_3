package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern: 특정데이터가 형식이 맞는지 비교하려고 할 경우 데이터 형식을 지정하는 클래스
//Matcher: 특정패턴의 형태가 맞는지 비교하는 클래스
//정규식(reg expression =>regex)
public class PatternExam1 {
	public static void main(String[] args) {
		String[] dt = {"bag","kim","9o6","single"};
		Pattern p = Pattern.compile("[0-9a-z]*");
		for(int i=0;i<dt.length;i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println(dt[i]);
			}
		}
		
		
		
		
		
	}
}
