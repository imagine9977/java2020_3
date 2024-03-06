package sec1;
class StudentMap<K,V>{
	private K key;
	private V value;
	
	public StudentMap() {
		super();
	}
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class GenericExam2 {
	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1, "김기태");
		StudentMap<Integer, String> s2 = new StudentMap<>(2, "김세라");
		StudentMap<Integer, String> s3 = new StudentMap<>(3, "수운하");
		
		StudentMap<String, Integer> s4 = new StudentMap<>( "수운하",90); //이렇게 하는게 가능함. K,V값이 고정값이 아니라서 순서 바꿔도 문제 없음
		StudentMap<String, Integer> s5 = new StudentMap<>( "김기태",100);
	}
}
