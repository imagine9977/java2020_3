package baek;
import java.util.Scanner;
public class beehive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nthRoom =sc.nextInt();
		int i = 0, j=0,b_n=0;
		int a_n = 3*(i*i-i)+1;
		for(i=0; a_n<=1000000000;i++) {
			a_n = 3*(i*i-i)+1;
			b_n = 3*(i*i+i)+1;
			if((nthRoom>=a_n)&&(nthRoom<=b_n)) {
				System.out.println(i+1);
				break;
			}
			
		}
		sc.close();
	}
}
