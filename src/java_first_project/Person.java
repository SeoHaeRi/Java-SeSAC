package java_first_project;

public class Person {
	protected String name;
	private int age;
	
//	생성자
	public Person() {
		System.out.println("사람 클래스의 인스턴스 생성됨");
	}
//	메소드 오버로딩
	public Person(String name, int age) {
		System.out.println("사람 클래스의 인스턴스 생성됨2");
		this.name = name;
		this.age = age;
	}
	
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
	
	public void sleep() {
		System.out.println("잠자기");
	}
	
	public void test() {
		System.out.println("test");
	}
}
