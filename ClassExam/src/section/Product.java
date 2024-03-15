package section;

public class Product {
	private int pno;	//? œ?’ˆë²ˆí˜¸
	private String name;	//? œ?’ˆëª?
	private String cate;	//ì¹´í…Œê³ ë¦¬ëª?
	private int price;		//? œ?’ˆ?‹¨ê°?
	private String url;		//? œ?’ˆ?´ë¯¸ì? ê²½ë¡œ
	private int amount;		//?ˆ˜?Ÿ‰
	public Product() { }
	public Product(int pno, String name, String cate, int price, String url, int amount) {
		this.pno = pno;
		this.name = name;
		this.cate = cate;
		this.price = price;
		this.url = url;
		this.amount = amount;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", cate=" + cate + ", price=" + price + ", url=" + url
				+ ", amount=" + amount + "]";
	}
}
