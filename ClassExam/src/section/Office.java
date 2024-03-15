package section;

public class Office {
	public int no;	//?¬λ¬΄μ€ μ½λ
	public String name;	//????Έ
	public int floor;	//μΈ΅μ
	public int roomNo;	//?Έ?€ λ²νΈ
	public double area;	//λ©΄μ 
	public int price;	//???λ£?
	public Office() { }
	public Office(int no, String name, int floor, int roomNo, double area, int price) {
		this.no = no;
		this.name = name;
		this.floor = floor;
		this.roomNo = roomNo;
		this.area = area;
		this.price = price;
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
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Office [no=" + no + ", name=" + name + ", floor=" + floor + ", roomNo=" + roomNo + ", area=" + area
				+ ", price=" + price + "]";
	}
	
}
