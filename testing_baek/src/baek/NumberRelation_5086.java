package baek;

import java.util.Scanner;

public class NumberRelation_5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		while((n!=0)&&(y!=0)) {
			if(n>y) {
				if(n%y==0) {
					System.out.println("multiple");
				}else System.out.println("neither");
			}else {
				if(y%n==0) {
					System.out.println("factor");
				}else System.out.println("neither");
			}
			n = sc.nextInt();
			y = sc.nextInt();
		}
		
	}
}
