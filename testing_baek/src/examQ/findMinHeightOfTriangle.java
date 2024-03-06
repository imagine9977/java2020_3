package examQ;

import java.util.Scanner;
import java.util.Stack;


public class findMinHeightOfTriangle {
	static void combinationUtil(int arr[][], int data[][], int start, int end, int index, 
			int r, Stack<Double> height,  int count) {
// Current combination is ready to be printed, print it
		if (index == r) {
			double minimum = 0;

			minimum = getH(data);
			/*if (height[count] == 0) {
				height[count] = minimum;
			} else {
				height[count] = (minimum < height[count]) ? minimum : height[count];
			}

			count++;
			minimum = Math.round(minimum * 10000000.0) / 10000000.0;
			*/
			height.push(minimum);
			//System.out.println(count+ ":  "+minimum);
			return;
		}

// replace index with all possible elements. The condition
// "end-i+1 >= r-index" makes sure that including one element
// at index will make a combination with remaining elements
// at remaining positions
		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r, height, count);
		}
	}

	public static boolean if_one_line(int[][] data) {
		int a = data[0][0] * (data[1][1] - data[2][1]) + data[1][0] * (data[2][1] - data[0][1])
				+ data[2][0] * (data[0][1] - data[1][1]);

		// Condition to check if
		// area is not equal to 0
		if (a == 0)
			return true;
		else
			return false;
	}

	public static double getH(int[][] data) {
		if (if_one_line(data)) {
			return 0;
		}
		double answer = 0, answer1 = 0, answer2 = 0, answer3 = 0;
		// h=2sqrt(s(s-a)(s-b)(s-c))/b , s= 0.5(a+b+c)
		double a = Math.sqrt((data[1][1] - data[0][1]) * (data[1][1] - data[0][1])
				+ (data[1][0] - data[0][0]) * (data[1][0] - data[0][0]));
		double b = Math.sqrt((data[2][1] - data[1][1]) * (data[2][1] - data[1][1])
				+ (data[2][0] - data[1][0]) * (data[2][0] - data[1][0]));
		double c = Math.sqrt((data[2][1] - data[0][1]) * (data[2][1] - data[0][1])
				+ (data[2][0] - data[0][0]) * (data[2][0] - data[0][0]));

		double s = (a + b + c) / 2;
		answer1 = 2 / a * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer2 = 2 / b * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer3 = 2 / c * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer = (answer1 < answer2) ? answer1 : answer2;
		answer = (answer < answer3) ? answer : answer3;
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// h=2sqrt(s(s-a)(s-b)(s-c))/b , s= 0.5(a+b+c)d
		Scanner sc1 = new Scanner(System.in);
		int numP = sc1.nextInt();
		int combinationOfPoints = numP * (numP - 1) * (numP - 2) / 6;
		//double heightArray[] = new double[combinationOfPoints];
		int[][] pointSets = new int[numP][2];
		for (int i = 0; i < numP; i++) {
			pointSets[i][0] = sc1.nextInt(); // x vale
			pointSets[i][1] = sc1.nextInt(); // y vale
		}
		Stack<Double> heightStack = new Stack<>();
		int data[][] = new int[3][2];
		combinationUtil(pointSets, data, 0, numP - 1, 0, 3, heightStack, 0);
		double min =  heightStack.peek();
		for (int i = 0; i < combinationOfPoints; i++) {
			double popped = heightStack.pop();
			//System.out.println(popped);
			if (min > popped && popped != 0)
				min = popped;
		}
		/*
		double min = heightArray[0];
		for (int i = 0; i < combinationOfPoints; i++) {
			System.out.println(heightArray[i]);
			if (min > heightArray[i] && heightArray[i] != 0)
				min = heightArray[i];
		}
		*/
		//min = Math.round(min * 10000000.0) / 10000000.0000000;
		if (min == 0) {
			System.out.println(0);
		} else
			System.out.printf("%.7f",min);

		// float f = 0;

	}

}
