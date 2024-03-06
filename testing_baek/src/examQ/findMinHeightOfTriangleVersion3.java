package examQ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class findMinHeightOfTriangleVersion3 {
	public static boolean if_one_line(int[][] data) {
		int a = data[0][0] * (data[1][1] - data[2][1]) + data[1][0] * (data[2][1] - data[0][1])
				+ data[2][0] * (data[0][1] - data[1][1]);
		if (a == 0)
			return true;
		else
			return false;
	}
    static double getH(int[][] data) {
    	if (if_one_line(data)) {
			return 0;
		}
    	double a = Math.sqrt((data[1][1] - data[0][1]) * (data[1][1] - data[0][1])
                + (data[1][0] - data[0][0]) * (data[1][0] - data[0][0]));
        double b = Math.sqrt((data[2][1] - data[1][1]) * (data[2][1] - data[1][1])
                + (data[2][0] - data[1][0]) * (data[2][0] - data[1][0]));
        double c = Math.sqrt((data[2][1] - data[0][1]) * (data[2][1] - data[0][1])
                + (data[2][0] - data[0][0]) * (data[2][0] - data[0][0]));

        double s = (a + b + c) / 2;
        double answer1 = 2 / a * Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double answer2 = 2 / b * Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double answer3 = 2 / c * Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double answer = (answer1 < answer2) ? answer1 : answer2;
		answer = (answer < answer3) ? answer : answer3;
		return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numP = Integer.parseInt(st.nextToken());
        double minHeight = Double.MAX_VALUE;
        int[][] pointSets = new int[numP][2];
        for (int i = 0; i < numP; i++) {
            st = new StringTokenizer(br.readLine());
            pointSets[i][0] = Integer.parseInt(st.nextToken()); // x value
            pointSets[i][1] = Integer.parseInt(st.nextToken()); // y value
        }

        for (int i = 0; i < numP - 2; i++) {
            for (int j = i + 1; j < numP - 1; j++) {
                for (int k = j + 1; k < numP; k++) {
                    int[][] triangle = {pointSets[i], pointSets[j], pointSets[k]};
                    double height = getH(triangle);
                    if (height < minHeight) {
                        minHeight = height;
                    }
                }
            }
        }

        if (minHeight == Double.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.printf("%.7f", minHeight);
        }
    }
}
