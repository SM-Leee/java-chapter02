package customer;

import chapter02.Customer;

public class VIPCustomer extends Customer{
	
	public void showInfo() {
		//protected는 같은 패키지 뿐만 아니라
		//자식에서도 접근이 가능하다.
		
		System.out.println(name);
		//age의 경우에는 private 외부에서 접근하지 못하기 때문에 오류가 뜬다.
		//System.out.println(age);
		System.out.println(getAge());
	}
	
}
