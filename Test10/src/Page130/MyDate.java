package Page130;

public class MyDate {
	private int day,month,year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public MyDate() {
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isValid() {
		if(month == 2) {
			if(day<=29&&day>=1) return true;
		}else if((month==4)||(month==6)||(month==9)||(month==11)) {
			if(day<=30&&day>=1) return true;
		}else {
			if(day<=31&&day>=1) return true;
		}return false;
	}
	public void print() {
		if(this.isValid()) System.out.println("유효한 날짜입니다");
		else System.out.println("유효하지 않은 날짜입니다");
	}
}
