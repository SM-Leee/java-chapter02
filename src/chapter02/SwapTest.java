package chapter02;

public class SwapTest {

	public static void main(String[] args) {

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

	}
	
	public static void swap(int i, int j) {
		int temp =i;
		i=j;
		j=temp;
		//함수호출이 끝나면 i,j,temp의 변수가 stack에서 빠져나온다.
	}

}
