package Page123;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		int y =scan.nextInt();
		int num=0;
		String s= scan.next();
		switch(s) {
		case "+":
			num = x+y;
			break;
		case "-":
			num=x-y;
			break;
		case "*":
			num = x*y;
			break;
		case "/":
			num = x/y;
			break;
		
		}
		System.out.println(num);
	} 
}
