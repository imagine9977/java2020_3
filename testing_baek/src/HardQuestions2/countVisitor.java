package HardQuestions2;

import java.util.Scanner;

public class countVisitor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int num = sc.nextInt();
		String x=sc.nextLine(); //skip first blank Int
		String[] visitor = new String[num];
		
		int countEnter= 0,countDuplicate=0,lastEnter=0;
		
		int i =0;
		while( i<num) {
			x=sc.nextLine();
			visitor[i]=x;
			
			//System.out.println(x);
			if(x.equals("ENTER")) {
				countEnter++;
				
				lastEnter = i;
			}else {
				
				for(int j = lastEnter; j<i;j++) {
					if (visitor[j].equals(x)) {
						countDuplicate++;
						break;
					}
				}
				
			} 
			i++;
		}
		System.out.println(num-countEnter-countDuplicate);
		sc.close();
	}

}
