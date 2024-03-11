package creational.abstractfactorymethod;
//AbstractFactoryPattern: �߻� Ŭ�������� �ڽ� �߻� Ŭ������ ���� Ŭ������ ��ӹ޾�
//ó���ǰ� �ϰ�, final ����� ����������  ��ü�� �����Ͽ� Ȱ��ȴٴ� �����ּ� �߻�ȭ ������ ��� �Ѵ�
public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		if(args.length!= 1) {
			System.out.println("���� ���� �ʴ� ȯ�溯��");
			System.out.println("Ŭ���� �̸� �̹߰�");
			System.out.println("main class ���� ����");
		}
		final Factory factory = Factory.getFactory(args[0]);
		Link googleLink = factory.createLink("����","https://www.google.com");
		Link naverLink = factory.createLink("���̹�","https://www.naver.com");
		Link daumLink = factory.createLink("����","https://www.daum.com");
		
		
		final Tray searchTray = factory.createTray("�˻�����");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("�˻����� ����Ʈ","�����");
		page.add(searchTray);
		page.output();
	}
}
