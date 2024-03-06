package rectangle;

import java.util.Scanner;

public class smallestRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] x = new int[size];
		int[] y = new int[size];
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int minX = x[0];
		int maxX = x[0];
		int minY = y[0];
		int maxY = y[0];
		for(int i=0;i<size;i++) {
			
			minX = (minX< x[i])?minX :x[i];
			maxX = (maxX> x[i])?maxX :x[i];
			minY = (minY< y[i])?minY :y[i];
			maxY = (maxY> y[i])?maxY :y[i];
		}
		System.out.println((maxX-minX)*(maxY-minY));
	}
}
