package section;
//?ïÑ?åå?ä∏
public class Apartment {
	private String town;	//?èô?Ñ§?ù¥Î¶?
	private String name;	//?ïÑ?åå?ä∏Î™?
	private int complex;	//?ã®Ïß?
	private int dong;		//?èô
	private int num;		//?ò∏
	private double area;	//Î©¥Ï†Å
	public Apartment() { }
	public Apartment(String town, String name, int complex, int dong, int num, double area) {
		this.town = town;
		this.name = name;
		this.complex = complex;
		this.dong = dong;
		this.num = num;
		this.area = area;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getComplex() {
		return complex;
	}
	public void setComplex(int complex) {
		this.complex = complex;
	}
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Apartment [town=" + town + ", name=" + name + ", complex=" + complex + ", dong=" + dong + ", num=" + num
				+ ", area=" + area + "]";
	}
	
}
