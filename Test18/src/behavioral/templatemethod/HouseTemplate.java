package behavioral.templatemethod;

public abstract class HouseTemplate {
	public void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}

	private void buildWindows() {
		System.out.println("â�������");
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

	public void buildFoundation() {
		System.out.println("��ü, ��� ���� ��ῡ �´� �����縦 �����Ͽ����ϴ�");
	}
}
