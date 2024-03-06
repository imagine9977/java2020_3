package page230;

public class Exam4 {
	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		dog[0]=new Dog("눈탱이","치와와");
		dog[1]=new Dog("누렁이","진돗개");
		dog[2]=new Dog("누렁이2","진돗개");
		dog[3]=new Dog("누렁이3","진돗개");
		dog[4]=new Dog("누렁이4","진돗개");
		
		for(int i =0;i<5;i++) {
			System.out.println(dog[i].toString());
		}
	}
}
