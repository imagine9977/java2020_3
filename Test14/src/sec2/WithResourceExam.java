package sec2;

import java.io.IOException;



class AutoResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���ҽ� �嵿���� ����");
	}

}

public class WithResourceExam {
	public static void main(String[] args) throws Exception {

		try (AutoResource obj = new AutoResource()) {
			throw new Exception();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
