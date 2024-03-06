package Page197;

public class Q5 {
	public static void main(String[] args) {
		CoffeeShop c1 = new CoffeeShop(4000,"별다방","김씨","아메리카노");
		CoffeeShop c2 = new CoffeeShop(4500,"콩다방","이씨","라뗴");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//////////////////////////////////////
		
		
		Human h= new Human("Park", 60000);
		StarCafe sCafe = new StarCafe();
		BeanCafe bCafe = new BeanCafe();
		h.buyStarCafe(sCafe, 4000);
		h.buyBeanCafe(bCafe, 4500);
	}
	
	
}
