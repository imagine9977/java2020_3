package HardQuestions2;

import java.util.Scanner;

public class commonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int getNum = sc.nextInt();
		
		int[] score= new int[getNum];
		
		for(int i=0;i<getNum;i++) {
			score[i] = sc.nextInt();
		}
		int max =score[0], min=score[0]; 
		for(int i=0;i<getNum;i++) {
			max = (max>score[i])? max : score[i];
			min = (min<score[i])? min : score[i];
		}
		System.out.println(max*min);
	}
}
