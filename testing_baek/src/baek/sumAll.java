package baek;

import java.util.Scanner;
public class sumAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=max;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
