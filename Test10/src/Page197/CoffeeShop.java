package Page197;

public class CoffeeShop {
	private int price;
	private String Store;
	private String buyer;
	private String coffee;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStore() {
		return Store;
	}
	public void setStore(String store) {
		Store = store;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public CoffeeShop(int price, String store, String buyer, String coffee) {
		super();
		this.price = price;
		Store = store;
		this.buyer = buyer;
		this.coffee = coffee;
	}
	@Override
	public String toString() {
		return "CoffeeShop [price=" + price + ", Store=" + Store + ", buyer=" + buyer + ", coffee=" + coffee + "]";
	}
	
}
