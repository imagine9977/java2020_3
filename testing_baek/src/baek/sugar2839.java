package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sugar2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine()); 
		int bags = 0,temp15=0,temp5=0,temp3=0;
		
		if(num%5==0)bags=num/5;
		else {
			if(num%3==0) {
				temp15=num/15;
				bags = 3*temp15+(num%15)/3;
			}else {
				if((num-5)>0&&(num-5)%3==0) {
					//11=>1+2,23->4+1
					temp15=(num-5)/15;
					bags=temp15*3+1+((num-5)%15)/3;
				}else if((num-10)>0&&(num-10)%3==0) {
					temp15=(num-10)/15;
					bags=temp15*3+2+((num-10)%15)/3;
				}else {
					bags=-1;
				}
			}
		}
		
		System.out.println(bags);
	}
}
