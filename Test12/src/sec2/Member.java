package sec2;

public class Member {
	int bno;
	String id;
	String pw;
	String name;
	int num;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Member(int bno, String id, String pw, String name, int num) {
		super();
		this.bno = bno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Member [bno=" + bno + ", id=" + id + ", pw=" + pw + ", name=" + name + ", num=" + num + "]";
	}
	
}
