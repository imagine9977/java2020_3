package structural.adapter;

public class AdapterPattern {
	public static void main(String[] args) {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
		System.out.println(v6.getAmount());
		System.out.println(v9.getAmount());
		System.out.println(v12.getAmount());
		System.out.println(v110.getAmount());
	}

	public static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
		System.out.println(v6.getAmount());
	}

	public static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 6:
			return sockAdapter.get6Volt();
		case 9:
			return sockAdapter.get9Volt();
		case 12:
			return sockAdapter.get12Volt();
		default:
			return sockAdapter.get110Volt();
		}

	}
}
