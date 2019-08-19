package paint;



public class Point implements Drawable{

	private int x;
	private int y;

	// 생성자 오버로딩
	public Point() {

	}

	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 코드의 재사용!!!
	public void show() { // TODO Auto-generated method stub
		System.out.println("점[x=" + x + ", y=" + y + "] 를 그렸습니다.");
	}

	// 오버로딩 기법 적용
	public void show(boolean visible) {
		// TODO Auto-generated method stub
		if (visible) {
			show();	//코드의 재사용!!!
			// System.out.println("점[x="+ x +", y="+ y +"] 를 그렸습니다.");
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
		}
	}

	public void disappear() {
		System.out.println("점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	

}
