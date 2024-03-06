package rectangle;

import java.util.Scanner;

public class nearestSides {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y=sc.nextInt();
		int width = sc.nextInt();
		int height=sc.nextInt();
		int t1 = (x<y)? x: y;
		int t2 = ((width-x)<(height-y))? (width-x): (height-y);
		int answer = (t1<t2) ? t1:t2;
		System.out.println(answer);
	}
}
