package section;
//ê³„ì¢Œ
public class Account {	
	private int accId;		//ê³„ì¢Œë²ˆí˜¸(5?ë¦?)
	private String name;	//?˜ˆê¸ˆì£¼
	private String bankName;	//ê¸ˆìœµê¸°ê?
	private int balance;	//?”?•¡
	public Account() {}
	public Account(int accId, String name, String bankName, int balance) {
		this.accId = accId;
		this.name = name;
		this.bankName = bankName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [ê³„ì¢Œë²ˆí˜¸:" + accId + ", ?˜ˆê¸ˆì£¼=" + name + ", ê¸ˆìœµê¸°ê?ëª?=" + bankName + ", ?”?•¡=" + balance + "]";
	}
}
