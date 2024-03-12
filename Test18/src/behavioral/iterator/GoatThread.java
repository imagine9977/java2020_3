package behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class GoatThread {
	public static final int MAX_GOATS = 100;
	private int goatNum = 0;
	public static final HashMap<Integer, GOAT> Goats = new HashMap<>();
	public GoatThread() {
		super();
		int i = 0;
		for(i=0;i<30;i++) {
			Goats.put(i,new GOAT());
		}
		goatNum =i;
	}
	
	public void addGoat() {
		if(Goats.size()<=MAX_GOATS) {
			Goats.put(++goatNum, new GOAT());
		}
	}
	
	public void removeGoat() {
		if(Goats.size()>0) {
			Goats.remove(--goatNum);
		}
	}
	
	public Iterator<Integer> createIterator(){
		return Goats.keySet().iterator();
	}
}
