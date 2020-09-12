
public class squaresumsquare {
	public static void main(String[] args) {
		final int nth = 100;
		long sumOfSquare = (nth * (nth + 1) * (2 * nth + 1)) / 6;
		long sum = (nth * (nth + 1)) / 2;
		long squareOfSum = sum * sum;
		long res = squareOfSum - sumOfSquare;
		System.out.println(sumOfSquare);
		System.out.println(squareOfSum);
		System.out.println(res);
	}
}
