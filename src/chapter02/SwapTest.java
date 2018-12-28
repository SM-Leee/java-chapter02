package chapter02;

public class SwapTest {

	public static void main(String[] args) {

		//
		//call by value
		//
		int a = 10;
		int b = 20;
		System.out.println(a+" : "+b);
		
		//swap
		//int temp = a;
		//a=b;
		//b=temp;
		
		swap(a,b);
		//stack때문에 변형되지 않는다.
		
		
		System.out.println(a+" : "+b);
		
		//
		//call by reference ( 객체로 만들어서 하는것 )
		//
		Value m = new Value();
		m.value = 10;
		Value n = new Value();
		n.value = 20;

		System.out.println(m.value+" : "+n.value);
		
		swap(m,n);
		
		System.out.println(m.value+" : "+n.value);
				
	}
	
	public static void swap(int i, int j) {
		int temp =i;
		i=j;
		j=temp;
		//함수호출이 끝나면 i,j,temp의 변수가 stack에서 빠져나온다.
	}
	public static void swap(Value i, Value j) {
		int temp = i.value;
		i.value=j.value;
		j.value=temp;
	}
	//같이 이름의 함수가 있는데 안에 있는 변수가 다르거나, return 값의 유무에 따라 다른것이 : 오버로딩이라고 한다.

}
