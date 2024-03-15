package section;

public class Foods {
	private int fcode;	//??์ฝ๋
	private String name;	//??๋ช?
	private String mainMat;	//์ฃผ์ฌ๋ฃ?
	private double cal;		//์นผ๋ก๋ฆ?
	private int amount;		//1?ธ๋ถ? ์ด? ์ค๋
	private int price;		//1?ธ๋ถ? ??๊ฐ?๊ฒ?
	public Foods() { }
	public Foods(int fcode, String name, String mainMat, double cal, int amount, int price) {
		this.fcode = fcode;
		this.name = name;
		this.mainMat = mainMat;
		this.cal = cal;
		this.amount = amount;
		this.price = price;
	}
	public int getFcode() {
		return fcode;
	}
	public void setFcode(int fcode) {
		this.fcode = fcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainMat() {
		return mainMat;
	}
	public void setMainMat(String mainMat) {
		this.mainMat = mainMat;
	}
	public double getCal() {
		return cal;
	}
	public void setCal(double cal) {
		this.cal = cal;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Foods [fcode=" + fcode + ", name=" + name + ", mainMat=" + mainMat + ", cal=" + cal + ", amount="
				+ amount + ", price=" + price + "]";
	}
	
}
