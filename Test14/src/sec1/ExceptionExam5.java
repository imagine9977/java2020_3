package sec1;
class Animal{}
class Dog extends Animal{};
class Cat extends Animal{};
public class ExceptionExam5 {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		Animal ani2 = new Dog();
		changeAnimal(ani2);
		Animal ani3 = new Cat();
		changeAnimal(ani3);
	}
	
	public static void changeAnimal(Animal animal) {
		// TODO Auto-generated method stub
		try {
			Dog dog = (Dog) animal;
			
		} catch(ClassCastException e) {
			System.out.println("클래스 변경 불가능");
			e.printStackTrace();
		}catch(Exception e) {
			e.getMessage();
		}finally {
			System.out.println("작업종료");
		}
	}
}
