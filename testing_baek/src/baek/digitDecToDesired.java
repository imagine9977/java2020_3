
package baek;
import java.util.Scanner;

public class digitDecToDesired {
	//ASCII 값을 이용해서 정수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int baseDigit = sc.nextInt();
		String finalNumber = "";
		int remainder;
		char charV;
		while(inputNumber !=0) {
			remainder = inputNumber%baseDigit;
			if(remainder>9) {
				charV = (char) (remainder+55);
			}else {
				charV = (char) (remainder+48);
			}
			finalNumber =charV+finalNumber;
			inputNumber/=baseDigit;
		}
		
		System.out.println(finalNumber);
	}

}
