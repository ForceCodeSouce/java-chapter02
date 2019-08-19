package chapter02;

public class Goods {
	
	//String name;
	//int price;
	//int countStock;
	//int countSold;
	
	//접근제한자 - private
	//인스턴스 변수
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//스태틱 변수
	public static int countOfGoods; //public으로 만들었기에 외부에서 접근 가능
	
	/*
	 * public void a() { //정확하게는 접근이 되는건 아니지만, 편의를 봐주는것. //구조상 같은 클래스 안에 있으면 접근이
	 * 가능하다. countOfGoods = 100; //Goods.countOfGoods = 100; }
	 */
	//static은 static만 접근 가능하다.
	//instance는 static에 접근할수 있다.
	
	public static void a() {
		//정확하게는 접근이 되는건 아니지만, 편의를 봐주는것.
		//구조상 같은 클래스 안에 있으면 접근이 가능하다. 
		//countOfGoods = 100;
		//Goods.countOfGoods = 100;
		
		//name = null; //안된다.
		
	}
	
	public Goods() {
		//Goods.countOfGoods++;
		//Goods.countOfGoods += 1;
		countOfGoods += 1;
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
		//정보보호 로직
		if(price <0) {
			price = 0;
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
	
	public void showInfo() {
		System.out.println(name +":"+
							price+":"+
							countStock+":"+
							countSold+":");
	}

	public int calcDiscountPrice(float discountRate) {
		
		
		return price - (int)(price * discountRate);
	}
	
	
	

}
