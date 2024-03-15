package section;

public class Goverment {
	private int gno;	//? •ë¶?ê¸°ê?ì½”ë“œ
	private String name;	//? •ë¶?ê¸°ê?ëª?
	private String addr;	//? •ë¶?ê¸°ê? ì£¼ì†Œ
	private String tel;		//? •ë¶?ê¸°ê? ?—°?½ì²?
	private int budget;		//?˜ˆ?‚°?•¡
	private int empCnt;		//ì¢…ì‚¬??ˆ˜
	public Goverment() {}
	public Goverment(int gno, String name, String addr, String tel, int budget, int empCnt) {
		this.gno = gno;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.budget = budget;
		this.empCnt = empCnt;
	}
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getEmpCnt() {
		return empCnt;
	}
	public void setEmpCnt(int empCnt) {
		this.empCnt = empCnt;
	}
	@Override
	public String toString() {
		return "Goverment [gno=" + gno + ", name=" + name + ", addr=" + addr + ", tel=" + tel + ", budget=" + budget
				+ ", empCnt=" + empCnt + "]";
	}
	
}
