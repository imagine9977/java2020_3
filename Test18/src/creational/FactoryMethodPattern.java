package creational;
//Factory Method Pattern: 객체를 만드는 부분을 
//부모 추상 클래스(factory)로 선언하고 생성은 서브 클래스의 생성자(IDCARDFACTORY)로 생성
//IDCARD를 만드는 공장을 활용
//추상체로 Factory 클래스, Product Class

import structural.Factory;

public class FactoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("장인범");
		Product card2 = factory.create("강수현");
		card1.use();
		card2.use();
		
	}
}
