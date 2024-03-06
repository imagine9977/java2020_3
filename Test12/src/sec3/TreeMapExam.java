package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[] args) {
		Map map0 = new TreeMap<>();
		TreeMap<Integer,String>map1 =new TreeMap<>();
		TreeMap<Integer,String> map2 = new TreeMap<Integer,String>();
		TreeMap<Integer,String> map3 =new TreeMap<>(map1);
		TreeMap<Integer,String>map4 =new TreeMap<>() {{
			put(1,"Bob");
		}};
		map2.put(1, "Job");
		map2.put(2,"Jack");
		map2.put(3,"Justing");
		map2.put(4,"Jolly");
		map2.remove(4);
		System.out.println(map2);
		System.out.println(map2.firstKey());
		System.out.println(map2.firstEntry());
		System.out.println(map2.lastKey());
		System.out.println(map2.lastEntry());
	}
}
