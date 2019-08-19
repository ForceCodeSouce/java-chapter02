package chapter02;

import paint.Shape;

public class Triangle extends Shape{
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	

	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getX3() {
		return x3;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public int getY3() {
		return y3;
	}
	public void setY3(int y3) {
		this.y3 = y3;
	}

	
	/*
	 * public void draw() { System.out.println("삼각형을 그렸습니다."); }
	 */
	
	@Override	//어노테이션!!! - 1.6 에서부터 지원 - 코드를 명확하게 그리고 심플하게 만들어주는 기능!!!
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그렸습니다.");
	}
	@Override
	public void Resizable() {
		// TODO Auto-generated method stub
		
	}
	

}
