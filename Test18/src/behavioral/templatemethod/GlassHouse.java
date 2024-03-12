package behavioral.templatemethod;

public class GlassHouse extends HouseTemplate{
	
	@Override
	public void buildWalls() {
		System.out.println("유리벽을 만듭니다");
	}

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("유리 기둥을 만듭니다");
	}


}
