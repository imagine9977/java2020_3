package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Bob";
		String name2 = new String("bob");
		Integer sy1 = 1004;
		String su2 = "1004";
		String su3 = String.valueOf(sy1);
		System.out.println(sy1.equals(su2));
		System.out.println(su2.equals(su3));
		String str = "Annny/Benny/Carol/Dora/Ella/Fiona";
		String[] names = new String[6];
		names  = str.split("/");
		for(String s:names) {
			System.out.println(s);
		}
		String str2 = String.join("/", names);
		
		System.out.println(str2);
		String data = " ivE\'snewJeans\nSing\nBigbang ";
		char ten = data.charAt(9);
		System.out.println(ten);
		String trimData = data.trim();
		int size =data.length();
		int n= data.indexOf('n');
		String up = data.toUpperCase();
		String down = data.toLowerCase();
		String sub1 = data.substring(20, 28);
		String sub2 = data.replace("newJeans", "LLESARPHIM");
		System.out.println(sub2);  
		
		String girlgroup = data.substring(data.lastIndexOf('i'),data.lastIndexOf('i')+3);
		System.out.println("girlgrou[:" + girlgroup);
		
	}

}
