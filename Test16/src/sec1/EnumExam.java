package sec1;

enum Week1 {
	SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Week2 {
	SUN("��"), MON("��"), TUE("ȭ"), WED("��"), THU("��"), FRI("��"), SAT("��");

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
				System.out.println("��");
				break;
			case SUN:
				System.out.println("��");
				break;
			default:
				System.out.println("����");
			}
		}
		
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w: arrWeek2) {
			System.out.println(w.ordinal()+"��° ����:"+w.getDay());
		}
		
	}
}
