package section;
//ÍµêÏû¨
public class Book {
	private int booId;	//Í≥†Ïú†Î≤àÌò∏
	private String name;	//Ï±ÖÏù¥Î¶?
	private int amount;		//Ï±ÖÏàò?üâ
	private int price;		//Í∞?Í≤?
	private String author;	//???ûê
	public Book() {}
	public Book(int booId, String name, int amount, int price, String author) {
		this.booId = booId;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.author = author;
	}
	public int getBooId() {
		return booId;
	}
	public void setBooId(int booId) {
		this.booId = booId;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [booId=" + booId + ", name=" + name + ", amount=" + amount + ", price=" + price + ", author="
				+ author + "]";
	}
}
