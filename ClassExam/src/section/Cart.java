package section;
//?��바구?��
public class Cart {
	private int cno;	//?��바구?��번호
	private String id;	//?��?��?��?��?��
	private int pno;	//?��?��번호
	private int amount;	//?��?��?��?��
	private int price;	//?��?���?�?
	public Cart() {}
	public Cart(int cno, String id, int pno, int amount, int price) {
		this.cno = cno;
		this.id = id;
		this.pno = pno;
		this.amount = amount;
		this.price = price;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
		return "Cart [cno=" + cno + ", id=" + id + ", pno=" + pno + ", amount=" + amount + ", price=" + price + "]";
	}
}
