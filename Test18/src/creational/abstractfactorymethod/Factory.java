package creational.abstractfactorymethod;

//�����ξ� �Ű澲�� �ʰ�, �߻�ü�� �����  Ŭ����
public abstract class Factory {
	//getFactory�� classname �ŰԺ��� ���� Ŭ������ ������� ���ΰ�
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ����" + classname + "�� �߰ߵ��� �ʾҽ��ϴ�.");
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
