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
		
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		((ColorPoint)p3).setColor("Red");
		p3.show();
		p3.show(false);

	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
}
