import java.lang.Math;
public class threedigitpalindrome {

	public static void main(String[] args) {
		for( int i = 9; i > 0; i-- ) {
			for(int j = 9; j >= 0; j--) {
				for(int k = 9; k >= 0; k--) {
					int number = 100000*i + 10000*j + 1000*k + 100*k + 10*j + i;
					int root = (int)(Math.sqrt(number));
					for( int l = 100; l <= root; l++) {
						if( number % l == 0 ) {
							int multiplier = number / l;
							if( multiplier / 100 != 0 && multiplier / 1000 == 0) {
								System.out.println(number);
								return;
							}
						}
					}
				}
			}
		}

	}

}
