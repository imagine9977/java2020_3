package baek;

import java.util.Scanner;

public class receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum =0;
		long initialSum = sc.nextLong();
		long price;
		int amount;
		int count = sc.nextInt();
		for(int i =0;i<count;i++) {
			price = sc.nextLong();
			amount = sc.nextInt();
			sum += price*amount;
		}
		if(initialSum ==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
