package java_first_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import test.Hello;

public class Main {

	public static void hello() {
		System.out.println("hello~");
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtrac(double num1, double num2) {
		return num1 - num2;
	}

	public static double multipli(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

//		hello();
//		System.out.println(sum(1,2));
		// TODO Auto-generated method stub
//		System.out.println("안녕하세요");
//		System.out.println("반가워요");
//		System.out.println("잘있어요");
//		System.out.println("다시 만나요");

		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름, 나이, 키, 결혼 여부 입력하세요");
//		String name = scanner.next();
//		int age = scanner.nextInt();
//		double height = scanner.nextDouble();
//		boolean single = scanner.nextBoolean();
//		
//		scanner.close();
//		
//		System.out.println("이름은 " + name);
//		System.out.println("나이는 " + age);
//		System.out.println("키는 " + height);
//		System.out.println("결혼 여부 " + single);

//		System.out.println("이름을 입력하세요");
//		String name = scanner.next();
//		System.out.println("나이를 입력하세요");
//		int age = scanner.nextInt();
//		System.out.println("안녕하세요! " + name+"님 ("+ age + "세)");
//		scanner.close();
//		
//		String str1 = new String("홍길동");
//		String str2 = "홍길동";
//		
//		if(str1 == "홍길동") {
//			System.out.println(true);
//		} else if(str1.equals("홍길동")) {
//			System.out.println("equals");
//		}
//		
//		
//		for(int i = 0; i < 5; i ++) {
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		while(i < 5) {
//			System.out.println(i + " ");
//			i++;
//		}
//		
//		System.out.println("---------");
//		
//		int j = 10;
//		do {
//			System.out.println("do" + j + " ");
//			j++;
//		}while (j<10);
//		

//		System.out.println("나이를 입력하세요");
//		int age = scanner.nextInt();
//		
//		if(age >=1 && age <= 7) {
//			System.out.println("유아");
//		} else if(age >= 8 && age <=13 ) {
//			System.out.println("초등학생");
//		} else if(age >= 14 && age <=16 ) {
//			System.out.println("중학생");
//		}else if(age >= 17 && age <=19 ) {
//			System.out.println("고등학생");
//		}else if(age >=20) {
//			System.out.println("성인");
//		}

//		System.out.println("이름을 입력하세요");
//		String name = scanner.next();
//		switch(name) {
//		case "홍길동":
//			System.out.println("남자");
//			break;
//		case "성춘향":
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("모르겠어요");
//		}

//		System.out.println("숫자를 입력하세요");
//		int age = scanner.nextInt();
//		
//		for(int i = 1; i <= age; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("숫자 두개를 입력하세요");
//		double num1 = scanner.nextInt();
//		double num2 = scanner.nextInt();
//		
//		System.out.println("덧셈 결과 : " + add(num1, num2));
//		System.out.println("뺄셈 결과 : " + subtrac(num1, num2));
//		System.out.println("곱셈 결과 : " + multipli(num1, num2));
//		System.out.println("나눗셈 결과 : " + division(num1, num2));

//		배열
//		int[] arr1 = {0,0,0};
//		int[] arr2 = new int[3];
//		
////		arr1 = [0,1,2]
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i]= i;
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		
////		forEach
//		for(int value : arr1) {
//			System.out.println(value + " ");
//		}

//		2 차원 배열
//		int[][] arr1 = {{0,1,2},{3,4,5}};
//		int[][] arr2 = new int[2][3];
//		
//		for (int[] arr: arr1) {
//			for (int value : arr) {
//				System.out.print(value + " ");
//			}
//			System.out.println("");
//		}
//		
////		ArrayList
//		ArrayList<Integer> arrayList1 = new ArrayList<>();
//		ArrayList<Integer> arrayList2 = new ArrayList<>();
//		for(int i =1; i<6; i++) {
//			arrayList2.add(i);
//		}
//		
////		맨 뒤에 2 추가
//		arrayList1.add(2);
////		0번째 인덱스에 1 추가
//		arrayList1.add(0,1);
////		arrayList1 요소 뒤에 arrayList2 추가
//		arrayList1.addAll(arrayList2);
//		
//		for (int value : arrayList1) {
//			System.out.print(value + " ");
//		}
////		맨 처음 2를 값으로 갖는 인덱스
//		System.out.println("index of 2 : " + arrayList1.indexOf(2));
//		
////		인덱스 1번 제거
//		arrayList1.remove(1);
//		
////		요소 모두 제거
//		arrayList1.clear();

		
		/*
		 * int[] arr1 = new int[5]; 
		 * int sum = 0; 
		 * ArrayList<String> arrayList1 = new ArrayList<>();
		 * System.out.println("5개의 정수를 입력하세요"); 
		 * // for(int i=0;i<arr1.length; i++) { 
		 * // arr1[i] = scanner.nextInt(); 
		 * // sum += arr1[i]; // }
		 * // System.out.println((double)sum/arr1.length);
		 * 
		 * String str = ""; 
		 * while(!str.equals("exit")) {
		 * System.out.println("문자를 입력해주세요. : "); 
		 * str = scanner.nextLine();
		 * if(!str.equals("exit")) arrayList1.add(str); }
		 * 
		 * // while(true) { 
		 * // System.out.println("문자를 입력해주세요. : "); 
		 * // String str = scanner.nextLine(); 
		 * // if(str.equals("exit")) break; 
		 * // arr.add(str); 
		 * //}
		 * for(int i=0; i<arrayList1.size(); i++) {
		 * System.out.println(arrayList1.get(i)); }
		 */

//      예외처리
		/*
		 * int num1 = 5; int num2 = 0;
		 * 
		 * try { System.out.println(num1 / num2); } catch (ArithmeticException e) {
		 * System.out.println("0으로 나눌 수 없습니다"); } finally { System.out.println("끝"); }
		 * 
		 * 
		 * 
		 * 
		 * try { int num = scanner.nextInt(); System.out.println(num); } catch
		 * (InputMismatchException e) { System.out.println("정수를 입력하세요"); }
		 */
		
		
//		int[] arr1 = new int[4];
//		for(int i = 0; i < 4; i++) {
//			arr1[i] = i+1;
//		}
//		try {
//			for(int i = 0; i < 5; i++) {
//				System.out.println(arr1[i]);
//			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 범위를 벗어났습니다.");
//		}
		
		
		

//		Person person1 = new Person("ki", 26);
//		person1.myname();
		
//		int width = scanner.nextInt();
//		int height = scanner.nextInt();
//		Rectangle rectangle = new Rectangle(width, height);
//		
//		System.out.println(rectangle.area());
		
//		Hello hello1 = new Hello();
//		hello1.hello();
		
//		Person person1 = new Person();
//		person1.setName("ku");
//		System.out.println(person1.getName());
//		
//		ArrayList<Rectangle> rect = new ArrayList<>();
//		while(true) {
//			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요");
//			int width = scanner.nextInt();
//			int height = scanner.nextInt();
//			if(width == 0 && height == 0) break;
//			Rectangle rectangle = new Rectangle(width);
//			rectangle.setHeight(height);
//			rect.add(rectangle);
//		}
//		
//		for(Rectangle value : rect) {
//			System.out.println("가로 길이는: " + value.getWidth());
//			System.out.println("세로 길이는: " + value.getHeight());
//			System.out.println("넓이는: " + value.area());
//			System.out.println("-------------------------");
//		}
//		System.out.println("Rectangle 인스턴스의 개수는: " + Rectangle.count);
//		
//		Number number1 = new Number();
//		Number number2 = new Number();
//		number1.num1 = 1;
//		number1.num2 = 1;
//		
//		System.out.println(number2.num1);
//		System.out.println(number2.num2);
		
		
//		230304
//		Class 상속
		
//		Person p = new Person("name", 100);
//		Student s = new Student();
//		System.out.println(s.getName());
//		s.setName("이름이");
//		System.out.println(s.getName());
//		p.test();
//		s.test();
		
		
		Animal animal = new Animal();
		Cat cat = new Cat("냥이", 3);
		Dog dog = new Dog("멍이", 2);
		
		animal.makeSound();
		cat.makeSound();
		dog.makeSound();
		
	}
}
