package baek;
import java.util.Scanner;

public class Grades {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		int ScanInt1 = sc.nextInt();
		if(ScanInt1>=90) {
			System.out.println("A");
		}else if(ScanInt1>=80) {
			System.out.println("B");
		}else if(ScanInt1>=70) {
			System.out.println("C");
		}else if(ScanInt1>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
