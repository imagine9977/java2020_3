package section;

public class Human {
	private int hno;	//êµ¬ë¶„ì½”ë“œ
	private String name;		//?´ë¦?
	private int age;	//?‚˜?´
	private String addr;	//ì£¼ì†Œ
	private String tel;		//?—°?½ì²?
	public Human() {}
	public Human(int hno, String name, int age, String addr, String tel) {
		this.hno = hno;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Human [hno=" + hno + ", name=" + name + ", age=" + age + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
}
