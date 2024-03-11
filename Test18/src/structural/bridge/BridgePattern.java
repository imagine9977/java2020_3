package structural.bridge;

//Bridge�� Ư�� �߻�ȭ Ŭ����( SHAPE)�� ����� ����ϰ�, ����Ŭ����(����,������)���� �ش� ������ ��� ���� �ٸ� Ŭ������  �����Ͽ� �������� �� ū ��ü�� ������ �� �ֵ��� �ϴ� ����

public class BridgePattern {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		Shape pent = new Pentagon(new GreenColor());
		Shape tri2 = new Triangle(new GreenColor());
		Shape pent2 = new Pentagon(new RedColor());
		
		tri.applyColor();
		tri2.applyColor();
		pent.applyColor();
		pent2.applyColor();
	}
}
