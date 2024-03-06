package combinatorics;

import java.util.Scanner;

public class BinomialCoeff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		long total=1,d1 =1, d2=1;
		for(int i = 1; i<=n;i++) {
			total*=i;
		}
		for(int i = 1; i<=(k);i++) {
			d1*=i;
		}
		for(int i = 1; i<=(n-k);i++) {
			d2*=i;
		}
		System.out.println(total/d1/d2);
	}
}
