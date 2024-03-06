package page230;

public class Exam2 {
	public static void main(String[] args) {
		char[] arr = {'M','e','r','r','y','C','h','r','i','s','t','m','a','s'};
		char[] ovj = new char[arr.length];
		//System.arraycopy(arr, 0, ovj, 0, 0);
		for(int i =0;i<arr.length;i++) {
			int a = arr[i];
			if(a>=97) {
				ovj[i]=(char)(a-32);
			}else {
				ovj[i]= arr[i];
			}
		}
		//char a2 = (char) ((int)arr[2]-32);
		System.out.println(ovj);
	}
}
