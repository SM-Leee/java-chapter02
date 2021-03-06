package chapter02;

public class Goods {
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;	//인스턴스 변수
	//인스턴스 변수 - heap영역 안에서 하나당 4btye를 할당 받는다.
	//private로 하면 다른 class에서 사용할수 없다. 하지만 javabean을 통해서 사용할 수 있다.
	
	public static int countOfGoods; //class 변수
	
	public Goods(){
		//Goods.countOfGoods++; 정석 코드!
		countOfGoods++;
		//countOfGoods += 1;
		//countOfGoods = countOfGoods +1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) {
			price=0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {//매개변수는 없고, 리턴값이 있는 함수
		return countSold;
	}
	public void setCountSold(int countSold) {//매개변수는 있고, 리턴값이 없는 함수
		this.countSold = countSold;
	}
	
	public void showInfo() {//매개변수도 없고, 리턴값도 없는 함수
		System.out.println("상품이름"+name);
		System.out.println("가격"+price);
		System.out.println("재고량"+countStock);
		System.out.println("판매량"+countSold);
	}
	public int calcDiscountPrice(float discountRate) {//매개변수가 있고, 리턴값도 있는 함수
		return price - (int)(price * discountRate);
	}
	
	
}
