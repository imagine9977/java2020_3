package page230;

public class Exam3 {
	public static void main(String[] args) {
		int[] obj = new int[5];
		int cnt = 0;
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				obj[cnt]=i;
				cnt++;
			}
		}
		
		int tot =0;
		for(int i=0;i<obj.length;i++) {
			tot+=obj[i];
		}
		System.out.println(tot);
	}
}
