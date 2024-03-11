package structural;

import creational.Product;

//product를 만드는 create가 있으므로 이러한 것은 팩토리 매써드 패턴이라고 함
public abstract  class Factory { //추상체
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
