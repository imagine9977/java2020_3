package sec4;

public class Shop implements Delivery {
	@Override
	public void delivery() {
		System.out.println("배달");
	}


	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매");
	}
}
