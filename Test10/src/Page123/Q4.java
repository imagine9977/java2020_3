package Page123;

public class Q4 {
	public static void main(String[] args) {
		
		for(int i =1;i<5;i++) {
			for(int k=5-i;k>=0;k--) {
				System.out.print(" ");
			}
			for(int j = 1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
