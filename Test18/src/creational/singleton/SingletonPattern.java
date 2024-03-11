package creational.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance(1);
		System.out.println(ins1);
	}
}
