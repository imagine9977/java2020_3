package combinatorics;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total=1;
		for(int i = 1; i<=n;i++) {
			total*=i;
		}
		System.out.println(total);
	}
}
