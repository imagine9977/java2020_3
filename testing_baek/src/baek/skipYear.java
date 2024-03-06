package baek;
import java.util.Scanner;
public class skipYear {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		int ScanInt1 = sc.nextInt();
		int isLeap = 0;
		if(ScanInt1 %400 == 0) {
			isLeap = 1;
		}else if(ScanInt1%100 == 0) {
			
		}else if(ScanInt1%4 ==0) {
			isLeap = 1;
		}
		System.out.println(isLeap);
	}
}
