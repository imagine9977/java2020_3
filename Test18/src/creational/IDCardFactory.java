package creational;

import java.util.ArrayList;
import java.util.List;

import structural.Factory;

public class IDCardFactory extends Factory{
	private ArrayList owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add((IDCard) p);
	}
}
