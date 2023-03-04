package java_first_project;

public class Student extends Person {
	private String studentID;
	
	public Student() {
//		Person 생성자 실행됨
//		Person() 기본 생성자 = super()
//		or
//		super("홍길동", 47);
		this.name = "성춘향";
		System.out.println("student 생성자 실행됨");
	}
	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public void study() {
		System.out.println("공부하기");
	}
 
	public void test() {
		System.out.println("student test");
	}
}
