package paint;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//setX(x);
		//setY(y);
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		
		//부모코드를 남겨놓고, 구현하는것
		//부분 재구현
		
		//부모코드를 남겨놓지 않고 구현 재구현
		System.out.println("점[x=" + getX() + ", y=" + getY() + "color" +
		color +"] 를 지웠습니다.");
	}

}
