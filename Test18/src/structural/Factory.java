package structural;

import creational.Product;

//product�� ����� create�� �����Ƿ� �̷��� ���� ���丮 �Ž�� �����̶�� ��
public abstract  class Factory { //�߻�ü
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
