package section;

public class Payment {
	private int pno;	//ê²°ì œë²ˆí˜¸
	private String type;	//ê²°ì œ ?œ ?˜•
	private String sno;		//êµ¬ì… ? œ?’ˆ ë²ˆí˜¸
	private int amount;		//êµ¬ë§¤ ?ˆ˜?Ÿ‰
	private int money;		//ê²°ì œ ê¸ˆì•¡
	private String id;		//êµ¬ë§¤? ID
	public Payment() { }
	public Payment(int pno, String type, String sno, int amount, int money, String id) {
		this.pno = pno;
		this.type = type;
		this.sno = sno;
		this.amount = amount;
		this.money = money;
		this.id = id;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Payment [pno=" + pno + ", type=" + type + ", sno=" + sno + ", amount=" + amount + ", money=" + money
				+ ", id=" + id + "]";
	}
	
}
