package baek;

import java.util.Scanner;

public class diceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int temp, large;
		int sum =0;
		if((d1 == d2)||(d2==d3)||(d1==d3)) {
			if((d1==d2)&&(d2==d3)) {
				sum = 10000+d1*1000;
			}else {
				if((d1==d2)||(d1==d3)) {
					sum = 1000+d1*100;
				}else {
					sum = 1000+d2*100;
				}
			}
		}else {
			temp=d1>d2?d1:d2;  
			large=d3>temp?d3:temp;
			sum = large*100;
		}
		System.out.println(sum);
		
	}

}
