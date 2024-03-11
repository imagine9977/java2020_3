package structural.bridge;

//Bridge를 특정 추상화 클래스( SHAPE)에 멤버로 기용하고, 서브클래스(세모,오각형)에서 해당 색상을 골라 서로 다른 클래스를  조합하여 원래보다 더 큰 객체를 구현할 수 있도록 하는 패턴

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
