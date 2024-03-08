package sec3;
//코드 인스펙션
//PMD:코드 인스펙션 도구
//하는 이유: 서ㅗ능 개선, 에러 발생 가능성 최소화
//이름		심블		보안등급		코멘트
//Blocker	red		high		mandatory, memory leak or error probability is high
//Critical
//Urgent
//Important
//Warning
public class CodeInspectionExam {
	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"https://naver.com","네이버", 1);
		r1.def = "시작 페이지";
		System.out.println(r2.toString());
		System.out.println(r2.def);
	}
}
