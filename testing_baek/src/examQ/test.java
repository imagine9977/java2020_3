package examQ;

import java.util.Formatter;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fm=new Formatter();
	       
	      // Format 4 decimal places
	      fm.format("%.6f", 123.1234567);
	      System.out.println(fm);
	      fm.close();
	}

}
