package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1 = new Member();
		mem1.setId("kkt");
		mem1.setPoint(31);
		mem1.setPw("welcomePW");
		//System.out.println(mem1.getPw());
		
		
		Board b1 = new Board();
		b1.setTitle("kkt");
		b1.setBno(31);
		b1.setContent("welcomePW");
		b1.setViewCnt(19);
		//System.out.println(mem1.toString());
	}

}
