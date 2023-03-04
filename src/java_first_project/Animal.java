package java_first_project;

public class Animal {
	private String species;
	private String name;
	private int age;
	
	public Animal() {
		System.out.println("기본 생성자");
	}
	
	public Animal(String species, String name, int age) {
		this.species = species;
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("동물은 소리를 낸다");
	}
}
