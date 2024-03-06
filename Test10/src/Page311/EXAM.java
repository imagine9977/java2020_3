package Page311;

public class EXAM {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		System.out.println(Bus.MAX);
		Bus.MAX = 400;
		System.out.println(Bus.MAX);
		
		System.out.println(Bus.LIMIT);
		//Bus.LIMIT = 30; 변경 불가능
		System.out.println(Bus.LIMIT);
	}
	
	
}
