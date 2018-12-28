package chapter02;

public class Customer {
	
	//String name; //default 접근자 : 같은 패키지에서만 사용할 수 있다.
	//int age;		
	
	protected String name;	//protected 접근자 : 같은패키지와 자식 클래스만 쓸수있다.
	private int age;		//private 접근자 : 외부class에서 접근하지 못한다.
	
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
	
	

}
