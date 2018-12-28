package chapter02;

public class Goods {
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	//인스턴스 변수 - heap영역 안에서 하나당 4btye를 할당 받는다.
	//private로 하면 다른 class에서 사용할수 없다. 하지만 javabean을 통해서 사용할 수 있다.
	
	public static int countOfGoods;
	
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
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
	
}
