package baek;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class findFraction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 *  Scanner sc = new Scanner(System.in);
			int nthRoom =sc.nextInt();
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int nthRoom = Integer.parseInt(bf.readLine());
		int i = 0, j=0,b_n=0;
		int a_n = (i*i-i)/2+1;
		int top=0,bottom=0,position =0;
		for(i=0; a_n<=10000000;i++) {
			a_n = (i*i-i)/2+1;
			b_n = (i*i+i)/2;
			if((nthRoom>=a_n)&&(nthRoom<=b_n)) {
				position = nthRoom-a_n;
				top=position+1;
				bottom = i+1-top;
				if(i%2==0) {
					System.out.printf("%d/%d",top,bottom);
				}else {
					System.out.printf("%d/%d",bottom,top);
				}
				
				break;
			}
			
		}
		//sc.close();
		bf.close();
	}

}
