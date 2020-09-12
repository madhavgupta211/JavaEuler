import java.lang.Math;

public class twodigitPalindrome {

	public static void main(String[] args) {
		for( int i = 9; i > 0; i-- ) {
			for( int j = 9; j >= 0; j-- ) {
				int number = 1000 * i + 100 * j + 10 * j + i;
				int root = (int)(Math.sqrt(number));
				for( int k = 10 ; k <= root ; k++ ) {
					if( number % k == 0) {
						int multiplier = number / k;
						if( multiplier / 10 != 0 && multiplier / 100 == 0 ) {
							System.out.println(number);
							return;
						}
					}
				}
			}
		}
	}

}
