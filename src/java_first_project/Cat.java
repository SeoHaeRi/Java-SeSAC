package java_first_project;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super("고양이", name, age);
	}
	
	public void makeSound() {
		System.out.println("애용");
	}
}
