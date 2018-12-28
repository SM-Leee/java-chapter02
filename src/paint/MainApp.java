package paint;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(200);
		
		point.show();
		
		Point point2 = new Point(50, 50);
		point2.show();
		point2.show(false);

	}

}
