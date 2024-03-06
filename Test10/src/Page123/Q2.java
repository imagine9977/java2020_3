package Page123;

public class Q2 {
	public static void main(String[] args) {
		
		for(int i =1;i<10;i++) {
			for(int j = 2;j<10;j+=2) {
				System.out.printf("%dX%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
}
