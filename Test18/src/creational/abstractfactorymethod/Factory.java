package creational.abstractfactorymethod;

//구현부애 신경쓰지 않고, 추상체만 만드는  클래스
public abstract class Factory {
	//getFactory는 classname 매게변수 받은 클래스로 만들어진 것인가
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스" + classname + "가 발견되지 않았습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return factory;

	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
