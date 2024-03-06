package test;import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			if(input<=9) {
				for(int num =1;num<=9;num++) {
					System.out.printf("%d * %d = %d \n",input, num);
				}
			}
		}
	}


}
