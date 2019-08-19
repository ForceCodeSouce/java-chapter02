package paint;

import chapter02.Rect;
import chapter02.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		draw(p1);
		p1.show(false);

		draw(new Point(100, 200));
		draw(new ColorPoint(300, 200, "Yellow"));
		draw(new Triangle());
		draw(new Rect());
		draw(new Circle());
		draw(new GraphicText("Hello"));

		// instanceof 연산자
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable); // interface -> 구현했는지 안했는지 물어 보는것!!!

		Shape circle = new Circle();
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		// System.out.println(circle instanceof Circle);
		// 계층관계가 성립하지 않으면 연산자를 사용할 수 없다.

		System.out.println(circle instanceof Triangle);
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable); // interface -> 구현했는지 안했는지 물어 보는것!!!

		// drawPoint(p1);
		// p1.disappear();

		// 오버로딩하는 이유
		// 동일한 기능을 구현해주기 위해!!
		// p1.show();

		// p1.show(false);

		// Point p2= new Point(100,200);
		// drawPoint(p2);
		// draw(new Point(100, 200));

		// ColorPoint cp1 = new ColorPoint();
		// cp1.setX(300);
		// cp1.setY(200);
		// ((ColorPoint)cp1).setColor("Yellow");
		// cp1.setColor("Yellow");
		// draw(cp1);

		// cp1.show();
		// drawColorPoint(cp1);

		// 오버라이드의 장점!!!
		// draw(cp1);

		// Triangle triangle;
		// drawTriangle(triangle);

		// Rect rect = new Rect();
		// Drawable drawable;
		// Circle circle = new Circle();

	}

	public static void drawPoint(Point point) {
		point.show();
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	//이코드는 잠재적 위험이 있다.
	public static void resize(Drawable drawable) {
		if(drawable instanceof Resizable) {
		((Resizable)drawable).Resizable();
		}
	}

	/*
	 * public static void drawPoint(Point point) { point.show(true); }
	 * 
	 * public static void draw(Shape shape) { shape.draw(); }
	 * 
	 * public static void draw(ColorPoint color) { color.draw(); }
	 */

	/*
	 * public static void drawColorPoint(ColorPoint point) { point.show(true); }
	 */

	/*
	 * public static void draw(Triangle triangle) { triangle.draw(); }
	 * 
	 * public static void draw(Rect rect) { rect.draw(); }
	 */

	public static void draw() {

	}

}
