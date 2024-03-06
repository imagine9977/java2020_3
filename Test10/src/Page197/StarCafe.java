package Page197;

class Menu {
	final static int STARAMERICANO = 4000;
	final static int BEANAMERICANO = 4000;
	final static int STARLATTE = 4500;
	final static int BEANLATTE = 4500;
}

class Human {
	String name;
	int money;

	public Human(String name, int money) {
		this.money = money;
		this.name = name;
	}

	public void buyStarCafe(StarCafe sCafe, int money) {
		String msg = sCafe.brewing(money);
		if (msg != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원을 지불하여 " + msg);
		}
	}

	public void buyBeanCafe(BeanCafe bCafe, int money) {
		String msg = bCafe.brewing(money);
		if (msg != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "원을 지불하여 " + msg);
		}
	}

}

class StarCafe {
	int money;

	public String brewing(int money) {
		String brand;
		if (money == Menu.STARAMERICANO) {
			brand = "StarCafe STARAMERICANO";
			return brand;
		} else if (money == Menu.STARLATTE) {
			brand = "StarCafe STARLATTE";
			return brand;
		}

		return null;

	}
}

class BeanCafe {
	int money;

	public String brewing(int money) {
		String brand;
		if (money == Menu.BEANAMERICANO) {
			brand = "Bean Cafe BEANAMERICANO";
			return brand;
		} else if (money == Menu.BEANLATTE) {
			brand = "Bean Cafe BEANLATTE";
			return brand;
		}

		return null;

	}
}
