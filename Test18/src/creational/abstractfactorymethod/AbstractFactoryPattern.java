package creational.abstractfactorymethod;
//AbstractFactoryPattern: 추상 클래스에서 자식 추상 클래스는 구현 클래스로 상속받아
//처리되게 하고, final 모드의 구조적으로  객체를 생성하여 활용된다는 측묜애소 추상화 공장이 라고 한다
public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		if(args.length!= 1) {
			System.out.println("존재 하지 않는 환경변수");
			System.out.println("클래스 이름 미발견");
			System.out.println("main class 실행 오류");
		}
		final Factory factory = Factory.getFactory(args[0]);
		Link googleLink = factory.createLink("구글","https://www.google.com");
		Link naverLink = factory.createLink("네이버","https://www.naver.com");
		Link daumLink = factory.createLink("다음","https://www.daum.com");
		
		
		final Tray searchTray = factory.createTray("검색엔진");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("검색엔진 리스트","김기태");
		page.add(searchTray);
		page.output();
	}
}
