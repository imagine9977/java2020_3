package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
	}

}

public class JacksonExam1 {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		User user = new User("�����", 43);
		try {
			//��ü JSON Ÿ���� ���Ϸ� ��ȯ
			mapper.writeValue(new File("member.json"), user);
			//��ü�� JSON ž���� String���� ��ȯ
			String jsonUser = mapper.writeValueAsString(user); 
			System.out.println(jsonUser);
		} catch (JsonGenerationException e) {
			System.out.println("JSON FAIL");
		}
	}
}