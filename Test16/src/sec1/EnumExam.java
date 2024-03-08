package sec1;

enum Week1 {
	SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Week2 {
	SUN("일"), MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토");

	final private String day;

	Week2(String day){
		this.day =day;
	}

	String getDay() {
		return day;
	}
}

public class EnumExam {
	public static void main(String[] args) {
		Week1 w1 = Week1.SUN;
		Week2 w2 = Week2.valueOf("SUN");
		
		Week1[] arrWeek1 = Week1.values();
		for(Week1 w: arrWeek1) {
			switch(w) {
			case SAT:
				System.out.println("토");
				break;
			case SUN:
				System.out.println("일");
				break;
			default:
				System.out.println("평일");
			}
		}
		
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w: arrWeek2) {
			System.out.println(w.ordinal()+"번째 요일:"+w.getDay());
		}
		
	}
}
