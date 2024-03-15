package section;

public class Device {
	private int dno;	//?��치번?��
	private String name;	//?��치명
	private int amount;		//???��?��?��
	private int price;		//�?�?
	private String type;	//?��치종�?
	public Device() {}
	public Device(int dno, String name, int amount, int price, String type) {
		this.dno = dno;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.type = type;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Device [dno=" + dno + ", name=" + name + ", amount=" + amount + ", price=" + price + ", type=" + type
				+ "]";
	}
}