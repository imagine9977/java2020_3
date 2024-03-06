package sec4;

//Pay extends Inventory
public class Store extends Pay {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("상점");
		super.pay();
	}

	@Override
	public void inventory() {
		// TODO Auto-generated method stub
		System.out.println("재고 확인");
		super.inventory();
	}

}
