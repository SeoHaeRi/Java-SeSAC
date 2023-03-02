package java_first_project;

public class Person {
	private String name;
	private int age;
	
//	생성자
//	public Person() {
//		System.out.println("welcome!");
//	}
	
//	메소드
	public void myname() {
		System.out.println("my name is " + name);
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
