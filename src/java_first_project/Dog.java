package java_first_project;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super("강아지", name, age);
	}
	public void makeSound() {
		System.out.println("멍멍");
	}
}
