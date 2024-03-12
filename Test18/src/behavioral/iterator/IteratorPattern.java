package behavioral.iterator;

import java.util.Iterator;

public class IteratorPattern {
	public static void main(String[] args) {
		GoatThread goats = new GoatThread();
		goats.addGoat();
		goats.addGoat();
		goats.removeGoat();
		goats.addGoat();
		goats.addGoat();
		Iterator<Integer> goatIter = goats.createIterator();
		while(goatIter.hasNext()) {
			int key = goatIter.next();
			GOAT goat =goats.Goats.get(key);
			System.out.println(key);
			goat.sound();
		}
	}
}
