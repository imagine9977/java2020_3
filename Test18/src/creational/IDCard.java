package creational;

public class IDCard extends Product{
	private String owner;
	
	public IDCard(String owner){
		System.out.println(owner+"�� ī�带 ����ϴ�.");
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
