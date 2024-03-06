package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashTableExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("서울",1);
		hash.put("대구",2);
		hash.put("대전",3);
		hash.put("부산",4);
		hash.put("울산",5);
		hash.put("서귀포",6);
		hash.put("광주",7);
		hash.put("전주",8);
		
		System.out.println(hash.size());
		System.out.println(hash.containsKey("광주"));
		System.out.println(hash);
		Set<String> keySet = hash.keySet();
		
		hash.clear();
	}	

}
