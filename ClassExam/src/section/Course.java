package section;
//?ˆ˜ê°•ê³¼? •
public class Course {
	private int cno;	//?ˆ˜ê°•ê³¼? •ì½”ë“œ
	private String name;	//?ˆ˜ê°•ê³¼? •ëª?
	private int price;		//?ˆ˜ê°•ê?ê²?
	private int times;		//ê°•ì˜?‹œ?ˆ˜
	private String lector;	//ê°•ì‚¬ëª?
	public Course() {}
	public Course(int cno, String name, int price, int times, String lector) {
		this.cno = cno;
		this.name = name;
		this.price = price;
		this.times = times;
		this.lector = lector;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public String getLector() {
		return lector;
	}
	public void setLector(String lector) {
		this.lector = lector;
	}
	@Override
	public String toString() {
		return "Course [cno=" + cno + ", name=" + name + ", price=" + price + ", times=" + times + ", lector=" + lector
				+ "]";
	}
}
