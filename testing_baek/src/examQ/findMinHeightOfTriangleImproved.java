package examQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class findMinHeightOfTriangleImproved {
	static void combinationUtil(int arr[][], int data[][], int start, int end, int index, 
			int r, double[] height) {
// Current combination is ready to be printed, print it
		if (index == r) {
			double minimum = 0;

			minimum = getH(data);
			//System.out.printf("%.7f",minimum);
			if(height[0] ==0) {
				if(minimum !=0) height[0] = minimum;
			}else {
				height[0] = (height[0] < minimum) ? height[0] :minimum;
			}
			
			//System.out.println(":  "+height[0]);
			return;
		}
		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r, height);
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
		double a = Math.sqrt(Math.pow((data[1][1] - data[0][1]) ,2)
				+ Math.pow((data[1][0] - data[0][0]), 2));
		double b =  Math.sqrt(Math.pow((data[2][1] - data[0][1]) ,2)
				+ Math.pow((data[2][0] - data[0][0]), 2));
		double c = Math.sqrt(Math.pow((data[1][1] - data[2][1]) ,2)
				+ Math.pow((data[1][0] - data[2][0]), 2));

		double s = (a + b + c) / 2;
		answer1 = 2 / a * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer2 = 2 / b * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer3 = 2 / c * Math.sqrt(s * (s - a) * (s - b) * (s - c));
		answer = (answer1 < answer2) ? answer1 : answer2;
		answer = (answer < answer3) ? answer : answer3;
		return answer;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// h=2sqrt(s(s-a)(s-b)(s-c))/b , s= 0.5(a+b+c)d
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numP = Integer.parseInt(st.nextToken());
		double heightArray[] = new double[1];
		int[][] pointSets = new int[numP][2];
		for (int i = 0; i < numP; i++) {
			st = new StringTokenizer(br.readLine());
			pointSets[i][0] =  Integer.parseInt(st.nextToken()); // x vale
			pointSets[i][1] =  Integer.parseInt(st.nextToken()); // y vale
		}
		int data[][] = new int[3][2];
		combinationUtil(pointSets, data, 0, numP - 1, 0, 3, heightArray);
		
		
		if (heightArray[0] == 0) {
			System.out.println(0);
		} else
			System.out.printf("%.7f",heightArray[0]);

		// float f = 0;

	}

}
