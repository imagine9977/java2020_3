package blankPapaer;

public class testin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job();
		Rob robber = job;
		robber.action();
		robber.robbing();
		
		Police police = job;
		police.action();
		police.catching();
		
	}

}
