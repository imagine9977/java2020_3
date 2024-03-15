package section;

public class Nation {
	private int no;	//Íµ?Í∞?ÏΩîÎìú
	private String name; //Íµ?Í∞?Î™?
	private String capital;	//?àò?èÑ
	private String continent;	//??Î•ôÎ™Ö
	private int price;	//?ï≠Í≥µÎ£å
	private boolean entrance;	//?ûÖÍµ?Í∞??ä•?ó¨Î∂?
	public Nation() {}
	public Nation(int no, String name, String capital, String continent, int price, boolean entrance) {
		this.no = no;
		this.name = name;
		this.capital = capital;
		this.continent = continent;
		this.price = price;
		this.entrance = entrance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isEntrance() {
		return entrance;
	}
	public void setEntrance(boolean entrance) {
		this.entrance = entrance;
	}
	@Override
	public String toString() {
		return "Nation [no=" + no + ", name=" + name + ", capital=" + capital + ", continent=" + continent + ", price="
				+ price + ", entrance=" + entrance + "]";
	}
}
