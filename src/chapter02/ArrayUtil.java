package chapter02;

public class ArrayUtil {

	public static int[] intToDouble(int[] source) {

		int[] result = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}

		return result;
	}

	public static double[] doubleToInt(double[] source) {
		double[] result = new double[source.length];

		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}

		return result;
	}

	public static int[] concat(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		int index = 0;
		
		for (int i = 0; i < a1.length; i++) {
			//result[index] = a1[i];
			//index += 1;
			result[index++] = a2[i];
		}
		
		for (int i = 0; i < a2.length; i++) {
			result[index++] = a2[i];
		}
		
		return null;
	}

}
