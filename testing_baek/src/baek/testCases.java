package baek;

import java.util.Scanner;

public class testCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tCase = sc.nextInt();
		int a,b;
		for(int i=0;i<tCase;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
