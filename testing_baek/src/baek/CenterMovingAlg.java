package baek;
import java.util.Scanner;
public class CenterMovingAlg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = (int) Math.pow(2,i);
		int finalN = (int) Math.pow(1+j,2);
		System.out.println(finalN);
	}
}
