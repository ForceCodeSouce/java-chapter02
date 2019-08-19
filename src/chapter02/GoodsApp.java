package chapter02;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		//camera.name = "nikon";
		//camera.price = 400000;
		//camera.countStock = 30;
		//camera.countSold = 50;
		//System.out.println(camera.name + ":" +camera.price + ":" + camera.countStock + ":" + camera.countStock);
		
		//메소드로 접근하게 되면 정보보호가 된다.
		//메소드는 정보보호 로직도 작성할수도 있다.

		camera.setName("nikon");
		camera.setPrice(4000000);
		camera.setCountStock(30);
		camera.setCountSold(40);
		
		camera.setPrice(25000);
		
		long l = 10L;
		
		//camera.price = -1; //직접접근 하게 되면 정보보호가 안된다.
		
		camera.showInfo();
		System.out.println(camera.calcDiscountPrice(0.5f));
		
		
		System.out.println(Goods.countOfGoods);	//객체 생성 갯수를 알 수 있다.
		//System.out.println(camera.getName() + ":" +camera.getPrice() + ":" + camera.getCountStock() + ":" + camera.getCountSold());
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println(Goods.countOfGoods); //객체 생성 갯수를 알 수 있다.
	}

}
