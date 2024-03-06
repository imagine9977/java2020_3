package baek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ScanInt1 = sc.nextInt();
		int ScanInt2 = sc.nextInt();
		int digit, sum,  output_number,count;
		digit = sum =  output_number = count =0;
		List<Integer> stack = new ArrayList<>();
		while(ScanInt2 != 0) {
			digit = ScanInt2 %10;
			stack.add(digit);
			ScanInt2 = (ScanInt2-digit)/10;
		}
		while(!stack.isEmpty()) {
			output_number = stack.remove(0)*ScanInt1;
			System.out.println(output_number);
			sum += output_number*Math.pow(10,count);
			count++;
		}
		System.out.println(sum);
	}
}
