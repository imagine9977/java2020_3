package behavioral.templatemethod;

public abstract class HouseTemplate {
	public void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}

	private void buildWindows() {
		System.out.println("창문만들기");
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

	public void buildFoundation() {
		System.out.println("벽체, 기둥 등의 재료에 맞는 마감재를 선택하였습니다");
	}
}
