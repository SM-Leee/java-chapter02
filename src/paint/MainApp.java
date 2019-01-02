package paint;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(200);
		drawPoint(point);
		
		//point.show();
		
		Point point2 = new Point(50, 50);
		drawPoint(point2);
		//point2.show();
		//point2.show(false);
		
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		((ColorPoint)p3).setColor("Red");
		//p3.show();
		//p3.show(false);
		drawPoint(p3);
		
		Point p4 = new ColorPoint(200, 100, "yello");
		drawPoint(p4);
		
		Shape triangle = new Triangle();
		triangle.setLineColor("Black");
		
		//down cating -> 명시적으로(Exlicity)
		//Triangle t1 = (Triangle) triangle;
		((Triangle)triangle).setX1(20);
		
		drawShape(triangle);
		//drawTriangle(triangle);
		
		//up casting -> 암시적(Implicity)
		Rect rect = new Rect();
		Shape r1 = rect;
		drawShape(r1);
		//drawRect(rect);
		
		Shape circle = new Circle();
		drawShape(circle);
		//drawCircle(circle);

	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
	/*
	 * public static void drawTriangle(Triangle triangle) { triangle.draw(); }
	 * public static void drawRect(Rect rect) { rect.draw(); }
	 * public static void drawCircle(Circle circle){ circle.draw(); }
	 */
	
	
	
}
