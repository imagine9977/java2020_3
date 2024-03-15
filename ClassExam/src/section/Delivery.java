package section;

public class Delivery {
	private int dcode;	//ë°°ì†¡ì½”ë“œ
	private String rname;	//ë°›ëŠ” ?‚¬?Œ ?´ë¦?
	private String sname;	//ë³´ë‚´?Š” ?‚¬?Œ ?´ë¦?
	private int pay;		//ë°°ì†¡ë¹?
	private String addr;	//ë°›ëŠ”?‚¬?Œ ì£¼ì†Œ
	private int distance;	//ë°°ì†¡ê±°ë¦¬
	public Delivery() {}
	public Delivery(int dcode, String rname, String sname, int pay, String addr, int distance) {
		this.dcode = dcode;
		this.rname = rname;
		this.sname = sname;
		this.pay = pay;
		this.addr = addr;
		this.distance = distance;
	}
	public int getDcode() {
		return dcode;
	}
	public void setDcode(int dcode) {
		this.dcode = dcode;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Delivery [dcode=" + dcode + ", rname=" + rname + ", sname=" + sname + ", pay=" + pay + ", addr=" + addr
				+ ", distance=" + distance + "]";
	}
	
}
