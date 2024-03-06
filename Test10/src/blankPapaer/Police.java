package blankPapaer;

public interface Police {
	public static final int caught = 0;
	default void action() {
		System.out.println("Caught!");
	};
	
	default void catching() {
		System.out.println("Caught!");
	};
}
