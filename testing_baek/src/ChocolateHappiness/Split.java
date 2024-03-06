package ChocolateHappiness;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int small;
		int count =1;
		
		int multiple1 = 1;
		int multiple2 = 1;
		while(true) {
			small = M/2;
			multiple1*=N*(M-small);
			if(small ==1||small<N) {
				multiple1*=(N*small);
				break;
			}else {
				M=small;
			}
		}
		int	 remainder = multiple1%(1000000000+7);
		System.out.println(remainder);
		//multiple1 = (multiple1>multiple2)?multiple1:multiple2;
		//int	 remainder = multiple1%(1000000000+7);
		//System.out.println(remainder);
		sc.close();
	}
}
