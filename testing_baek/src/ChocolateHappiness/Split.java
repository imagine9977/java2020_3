package ChocolateHappiness;

import java.util.Scanner;

public class Split {
	private static int split(int N, int M, int num) {
		
		//N == 1일때라 2<= 값이 다름
		// 2와 3으로 나누기 vs 그냥 ^M승하기 
		int small;
		int count =1;
		
		int multiple1 = 1;
		int multiple2 = 1;
		small = M/2;
		multiple1*=N*(M-small);
		System.out.println(multiple1);
		if(small > 1&&small>N) {
			multiple1*=(N*small);
			num *= split(N,small,num);
		}
		if((M-small)>N) {
			num *= split(N,M-small,num);
		}
		
		return num;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int mult = split(N,M,1);
		int	 remainder = mult%(1000000000+7);
		System.out.println(remainder);
		//multiple1 = (multiple1>multiple2)?multiple1:multiple2;
		//int	 remainder = multiple1%(1000000000+7);
		//System.out.println(remainder);
		sc.close();
	}
}
