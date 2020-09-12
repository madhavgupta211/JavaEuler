
public class divisibilitydeLa20 {

	public static void main(String[] args) {
		final int multiple = 20;
		long currMultiple = 1;
		for( int i = 2; i <= multiple; i++ ) {
			currMultiple = lcm(currMultiple, i);
		}
		System.out.println(currMultiple);
	}
	
	public static long lcm(long num1, long num2) {
		long gcd = 0;
		long lcm;
		long a = num1;
		long b = num2;
		while( a != 0 && b != 0) {
			if(a < b) {
				b -= a;
				if(b == 0) {
					gcd = a;
				}
			}
			else {
				a -= b;
				if(a == 0) {
					gcd = b;
				}
			}
		}
		lcm = ( num1 * num2 ) / gcd;
		return lcm;
	}

}
