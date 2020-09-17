
public class specialTriplet {
	public static void main(String[] args) {
		final int sum = 1000;
		for( int a = 1; a <= 1000; a++ ) {
			for( int b = a + 1; b <= 1000; b++) {
				int c = sum - ( a + b );
				if( c >= b ) {
					if( a*a + b*b == c*c ) {
						System.out.println("The triplet is " + a + " " + b + " " + c);
						System.out.println("Their product is " + (long)(a*b*c));
						return;
					}
				}
			}
		}
		System.out.println("No triplet found.");
	}
}
