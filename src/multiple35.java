
public class multiple35 {
	public static void main(String[] args) {
		final int ceiling = 1000;
		final int num1 = 3;
		final int num2 = 5;
		int sum1 = multiple35.sum(num1, ceiling);
		int sum2 = multiple35.sum(num2, ceiling);
		int sumcommon = multiple35.sum( multiple35.lcm(num1, num2), ceiling);
		int finalSum = sum1 + sum2 - sumcommon;
		System.out.println(finalSum);
	}
	
	public static int sum(int num, int ceiling) {
		int finalNum = 0, sum;
		for( int i = (ceiling - 1); i > 0; i--) {
			if( i % num == 0 ) {
				finalNum = i;
				break;
			}
		}
		int nth = finalNum / num;
		sum = ( nth * ( num + finalNum )) / 2;
		return sum;
	}
	
	public static int lcm(int num1, int num2) {
		int lcm, a, b;
		int gcd = 0;
		a = num1;
		b = num2;
		while( a != 0 && b != 0 ) {
			if(a < b) {
				b -= a;
				if( b == 0 ) {
					gcd = a;
				}
			}
			else {
				a -= b;
				if( a == 0 ) {
					gcd = b;
				}
			}
		}
		lcm = ( ( num1 * num2 ) / gcd );
		return lcm;
	}
}
