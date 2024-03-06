package HardQuestions2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class countVisitor2 {
	
	public static void main(String[] args) throws IOException {	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine()); 
		String x;
		List<String> visitor = new ArrayList<>();
		int sum =0, i=0;
		while(i<num) {
			x = bf.readLine();
			
			if(x.equals("ENTER")) {
				sum+=visitor.size();
				visitor.clear();
			}else {
				if(!visitor.contains(x)) {
					visitor.add(x);
				}
				
			}
			i++;
		}		
		System.out.println(sum+visitor.size());		
		bf.close();
	}

}
