package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods goods = new Goods();
		//지역변수 - main이라는 block안에 있기때문 / 지역변수는 stack에 안들어진다.

		//goods.name = "hello"; //private로 이루어져 있기때문에 사용할 수 없다.
		goods.setName("nikon");
		goods.setPrice(400000);
		goods.setCountStock(30);
		goods.setCountSold(50);
		
		System.out.println("상품이름: "+goods.getName()+
							",가격: "+goods.getPrice()+
							",재고개수: "+goods.getCountStock()+
							",팔린개수: "+goods.getCountSold());
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		
	}

}
