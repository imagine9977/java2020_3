package dynamic;

import java.util.Scanner;

public class Fibonacci {
	public static int f(int n) {
		if (n == 1 || n == 2)
			return 1;
		return f(n - 2) + f(n - 1);
	}

	public static int fibonacci(int n) {
		int[] fibon = new int[n+1];
		fibon[1]=fibon[2]=1;
		for(int i =3;i<=n;i++) {
			fibon[i]=fibon[i-1]+fibon[i-2];
		}
		return fibon[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n)+"\t"+fibonacci(n));
	}

}
