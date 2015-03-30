package andkrul.fib;

import java.math.BigInteger;

public class Fibonacci {

	//TODO this methods should operates on BigIntegers becaus Int is too small
	/*public static double getElemnt(int n) {
		return (((1. / Math.sqrt(5.)) * Math
				.pow(((1. + Math.sqrt(5.)) / 2.), n)) - ((1. / Math.sqrt(5.)) * Math
				.pow(((1. - Math.sqrt(5.)) / 2.), n)));
	}

	public static int getElemntReq(int n) {
		if (n == 1 || n == 2)
			return 1;
		return getElemntReq(n - 1) + getElemntReq(n - 2);
	}
	*/	

	/**
	 * @param index index of fibonaci number from fibonaci sequence
	 * @throws IllegalArgumentException if index is smaller then 1 
	 * @return fibonaci number Fib(index)
	 */
	public static BigInteger getElemntLoop(int index) {

		if (index < 1)
			throw new IllegalArgumentException();
		if (index == 1)
			return new BigInteger("1");
		if (index == 2)
			return new BigInteger("1");

		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");

		for (int i = 3; i <= index; i++) {
			c = b.add(a);
			a = b;
			b = c;
		}
		return c;
	}
}
