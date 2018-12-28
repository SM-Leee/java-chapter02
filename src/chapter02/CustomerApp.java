package chapter02;

import chapter02.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		//protected : 같은 패키지에서 접근 가능 / 다른 패키지에서 접근이 안된다.
		c.name = "둘리";
		
		//private 접근자 : 외부에서 접근하지못한다.
		//c.age = 10;
		c.setAge(10);

	}

}
