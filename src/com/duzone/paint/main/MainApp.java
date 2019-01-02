package com.duzone.paint.main;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.ColorPoint;
import com.duzone.paint.point.Point;
import com.duzone.paint.shape.Circle;
import com.duzone.paint.shape.Rect;
import com.duzone.paint.shape.Shape;
import com.duzone.paint.shape.Triangle;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(200);
		draw(point);
		
		//point.show();
		
		Point point2 = new Point(50, 50);
		draw(point2);
		//point2.show();
		//point2.show(false);
		
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		((ColorPoint)p3).setColor("Red");
		//p3.show();
		//p3.show(false);
		draw(p3);
		
		Point p4 = new ColorPoint(200, 100, "yello");
		draw(p4);
		
		Shape triangle = new Triangle();
		triangle.setLineColor("Black");
		
		//down cating -> 명시적으로(Exlicity)
		//Triangle t1 = (Triangle) triangle;
		((Triangle)triangle).setX1(20);
		
		draw(triangle);
		//drawTriangle(triangle);
		
		//up casting -> 암시적(Implicity)
		Rect rect = new Rect();
		Shape r1 = rect;
		draw(r1);
		//drawRect(rect);
		
		Drawable circle = new Circle();
		draw(circle);
		//drawCircle(circle);
		
		GraphicString gs = new GraphicString("Hello");
		draw(gs);

		//연산자 instanceof 테스트
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Drawable);
		
		Circle c = (Circle)s;
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Object);
		///System.out.println(c instanceof Rect);
		//에러 : 계층관계가 아닌 경우에는 연산을 할 수 없음
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	/*
	 * public static void drawPoint(Point point) { point.show(); }
	 * 
	 * public static void drawShape(Shape shape) { shape.draw(); }
	 */
	
	/*
	 * public static void drawTriangle(Triangle triangle) { triangle.draw(); }
	 * public static void drawRect(Rect rect) { rect.draw(); }
	 * public static void drawCircle(Circle circle){ circle.draw(); }
	 */
	
	
	
}
