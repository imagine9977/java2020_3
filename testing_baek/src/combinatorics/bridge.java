package combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class bridge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCase = sc.nextInt();
		for(int k =0; k< numCase;k++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			BigInteger total= new BigInteger("1");
			BigInteger d1= new BigInteger("1");
			for(int i = m-n+1; i<=m;i++) {
				total=total.multiply(BigInteger.valueOf(i));
			}
			for(int i = 1; i<=n;i++) {
				d1=d1.multiply(BigInteger.valueOf(i));
			}
			
			System.out.println(total.divide(d1));
		
		}
		
	}
}
