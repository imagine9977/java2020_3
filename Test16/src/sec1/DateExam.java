package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date1 = new Date(); //¹«Á¶°Ç util
		System.out.println(date1);
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1981,12,25,7,24,33);
		System.out.println(date2);
		
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon, 02 Apr 2001 03:48:27 +0900");
		System.out.println(date3);
		
		System.out.println("*** LocalDate ***");
		LocalDate now1 = LocalDate.now();
		System.out.println(now1);
		String now2 = now1.toString();
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
	}
}
