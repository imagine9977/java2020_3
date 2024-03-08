package sec1;

import java.text.DecimalFormat;

public class DecimalFormatExam {
	public static void main(String[] args) {
		// original = 123.45
		//0 =>123, 0.0 \=>123.4 , 0.0000 =>123.4500
		//# =>123, #.# => 123.4 , #.#### =>123.45  유효숫자 생략한다
		
		//-1234
		//-#,-0 = -1234
		//#-,0- = 1234-
		//#, ##0 = -1,234
		//#E0 = 1.234E+03
		//#% = -123400%
		
		double m = 1234567.89;
		DecimalFormat df1 = new DecimalFormat("#,##0.0000");
		DecimalFormat df2 = new DecimalFormat("0,000,000.####");
		DecimalFormat df3 = new DecimalFormat("#,##0.0000");
		
		
		String res1 = df1.format(m);
		System.out.println(res1);
		
		String res2 = df2.format(m);
		System.out.println(res2);
	}
}
