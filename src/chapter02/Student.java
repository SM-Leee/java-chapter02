package chapter02;

public class Student extends Person{

	public Student() {
		// 자식 생성자에서 부모 생성자를 지정하지 않으면
		//기본적으로 부모의 기본 생성자가 (먼저)* 호출된다.
				
		//super(); 만들지 않아도 자동적으로 호출된다.
		System.out.println("Student() Called");
	}
}
