package baek;
import java.util.Scanner;
import java.lang.Math;

public class digitNConverter2745 {
	//ASCII 값을 이용해서 정수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNumber = sc.next();
		int baseDigit = sc.nextInt();
		int finalNumber = 0;
		int convert;
		int digit;
		for(int i =inputNumber.length()-1 ; i>=0;i--) {
			char charV = inputNumber.charAt(inputNumber.length()-i-1);
			
			if(charV >= 'A' && charV <= 'Z') {
				convert = (int)charV - 55;
			}else {
				convert = (int)charV - 48;
			}
			
			digit = (int) Math.pow(baseDigit,i);
			//System.out.println("convert: "+convert+"\nDigit: "+digit);
			finalNumber+=convert*digit;
		}
		
		System.out.println(finalNumber);
	}

}
