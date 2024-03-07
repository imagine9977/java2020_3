package sec3;

class PwFormatException extends Exception {
	public PwFormatException(String msg) {
		System.out.println("msg: " + msg + " 암호의 형시 불일치 발생");
	}
}

class Member{
	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw)throws PwFormatException {
		if(pw==null) {
			throw new PwFormatException("Empty"); //throw 를 강제로 던짐
			
		}else if(pw.length()<8||pw.length()>20) {
			throw new PwFormatException("Not 8~20");
		}
		
		this.pw = pw;
	}
}

public class UserExceptionExam2 {
	public static void main(String[] args) throws PwFormatException {
		Member mem1= new Member();
		mem1.setId("admin");
		try {
			mem1.setPw("12324");
		}catch(PwFormatException e) {
			e.printStackTrace();
		}
		mem1.setPw(null);
	}
}
