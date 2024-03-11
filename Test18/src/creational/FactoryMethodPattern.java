package creational;
//Factory Method Pattern: ��ü�� ����� �κ��� 
//�θ� �߻� Ŭ����(factory)�� �����ϰ� ������ ���� Ŭ������ ������(IDCARDFACTORY)�� ����
//IDCARD�� ����� ������ Ȱ��
//�߻�ü�� Factory Ŭ����, Product Class

import structural.Factory;

public class FactoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("���ι�");
		Product card2 = factory.create("������");
		card1.use();
		card2.use();
		
	}
}
