package ChocolateHappiness;

import java.util.Scanner;

public class Alternative {
	public static int power(int base, int powerRaised) {
		if (powerRaised != 0) {

			// recursive call to power()
			return (base * power(base, powerRaised - 1)) % (1000000000 + 7);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		double multiple1 = 1;
		double multiple2 = 1;
		if (N == 1) {
			if (M % 3 == 0) {
				multiple1 = (power(3, M / 3)) % (1000000000 + 7);
			} else if (M % 3 == 1) {
				if (M == 1)
					multiple1 = 1;
				else
					multiple1 = (power(3, M / 3 - 1) * 4) % (1000000000 + 7);
			} else {
				multiple1 = (power(3, M / 3) * 2) % (1000000000 + 7);
			}
		} else if (M == 1) {
			if (N % 3 == 0) {
				multiple1 = (power(3, N / 3)) % (1000000000 + 7);
			} else if (N % 3 == 1) {
				multiple1 = (power(3, N / 3 - 1) * 4) % (1000000000 + 7);
			} else {
				multiple1 = (power(3, N / 3) * 2) % (1000000000 + 7);
			}
		} else {
			multiple1 = power(N, M) % (1000000000 + 7);
			multiple2 = power(M, N) % (1000000000 + 7);

		}
		double mult = (multiple1 > multiple2) ? multiple1 : multiple2;
		System.out.println((int) mult);
		sc.close();
	}
}
