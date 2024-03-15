package section;

public class Lecture {
	private int cno;	//?��강과?��코드
	private String name;	//?��강과?���?
	private int price;		//?��강�?�?
	private int times;		//강의?��?��
	private String lector;	//강사�?
	public Lecture() {}
	public Lecture(int cno, String name, int price, int times, String lector) {
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
		return "Lecture [cno=" + cno + ", name=" + name + ", price=" + price + ", times=" + times + ", lector=" + lector
				+ "]";
	}
	
}
