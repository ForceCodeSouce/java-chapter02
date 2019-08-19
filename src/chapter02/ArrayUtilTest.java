package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {

		// TDD - 테스트 코드!!
		// 코드를 검증해서 에러를 잡을수 있어야 한다.

		int[] a1 = { 10, 11, 12, 13 };
		int[] d1 = ArrayUtil.intToDouble(a1);
		for (int d : d1) {
			System.out.print(d + " ");
		}

		double[] d2 = { 0.0, 1.1, 2.2, 3.3 };
		double[] a2 = ArrayUtil.doubleToInt(d2);
		for (double i : a2) {
			System.out.print(i + " ");
		}
		
		int[] a3 = {0, 1, 2, 3};
		

		// double배열을 int배열로 반환
		// int배열을 double배열로 반환

	}
}
