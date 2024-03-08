package sec1;

import java.util.Calendar;

public class CalenderExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
		int month = 1+today.get(Calendar.MONTH); 
		int day = today.get(Calendar.DATE);
		int minute = today.get(Calendar.MINUTE); 
		int hour12 = today.get(Calendar.HOUR); 
		int hour24 = today.get(Calendar.HOUR_OF_DAY);
		int second = today.get(Calendar.SECOND); 
		int ampm = today.get(Calendar.AM_PM); 
		int timezone = today.get(Calendar.ZONE_OFFSET);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		int firstDate = today.getActualMinimum(Calendar.DATE);
		System.out.println(month);
		System.out.println(day);
		
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		System.out.println("1/1���� ���ñ��� �ɸ� ��: "+doy);

		int dom = today.get(Calendar.DAY_OF_MONTH);
		System.out.println("3/1���� ���ñ��� �ɸ� ��: "+dom);

		int dow = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("�̹��� �Ͽ��Ϻ��� ���ñ��� �ɸ� ��: "+dow);
		
		int hour = today.get(Calendar.HOUR);
		
		String[] wk = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		System.out.println(wk[dow-1]); 
		//hour�� �⺻ 12�ð���
		if(ampm==0) {
			System.out.println("AM"+hour12+":"+minute+":"+second);
		}else {
			System.out.println("PM"+hour12+":"+minute+":"+second);
		}
		
		System.out.println("TIMEZONE: "+(timezone/1000/60/60));
		
	}
}
