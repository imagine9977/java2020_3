package blankPapaer;

public interface Rob {
	public static final int item = 0;
	default void action() {
		System.out.println("Robbed!");
	};
	
	default void robbing() {
		System.out.println("Robbed!");
	};
}
