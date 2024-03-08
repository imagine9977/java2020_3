package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExam {
	public static void main(String[] args) {
		Date today = new Date();
		
		//지역이름: KST, RFC 822 :+0900
		//국가코듸 KR, 언어코드: KO=>KO_KR
		
		
		SimpleDateFormat fmt1= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat fmt2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat fmt3= new SimpleDateFormat("오늘 날짜: yyyy년 MM월 dd일, 현재시각: a hh시 mm분 ss초");
		SimpleDateFormat fmt4= new SimpleDateFormat("오늘 날짜: yyyy년 MM월 dd일 W번째 주");
		String t1 = fmt1.format(today);
		System.out.println(t1);
		String t2 = fmt2.format(today);
		System.out.println(t2);
		String t3 = fmt3.format(today);
		System.out.println(t3);
		String t4 = fmt4.format(today);
		System.out.println(t4);
	}
}
