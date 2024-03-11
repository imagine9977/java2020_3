package creational;

public class IDCard extends Product{
	private String owner;
	
	public IDCard(String owner){
		System.out.println(owner+"의 카드를 만듭니다.");
		this.owner = owner;
		
	}
	
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}
	
}
