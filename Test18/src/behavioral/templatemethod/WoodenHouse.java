package behavioral.templatemethod;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("나무벽을 만듭니다");
	}

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("나무 기둥을 만듭니다");
	}

}
