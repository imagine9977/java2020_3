package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern: Ư�������Ͱ� ������ �´��� ���Ϸ��� �� ��� ������ ������ �����ϴ� Ŭ����
//Matcher: Ư�������� ���°� �´��� ���ϴ� Ŭ����
//���Խ�(reg expression =>regex)
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
