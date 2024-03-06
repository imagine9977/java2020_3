package baek;

import java.util.Scanner;

public class mtable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		for(int i =1; i<10;i++) {
			System.out.println(base + " * "+i+" = "+ (base*i));
		}
		sc.close();
	}

}
