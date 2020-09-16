
public class nthprime {

	public static void main(String[] args) {
		final int TOTAL = 1000000;
		boolean[] sieve = new boolean[TOTAL];
		int primeCounter = 0;
		int number = 0;
		final int nth = 10001;
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < TOTAL ; i++) {
			sieve[i] = true;
		}
		for(int i = 2; i < TOTAL; i++ ) {
			if(sieve[i]) {
				primeCounter++;
				System.out.println(primeCounter);
				number = i;
				if(primeCounter == nth) {
					break;
				}
				for( int j = 2*i; j < TOTAL ; j+=i ) {
					sieve[j] = false;
				}
			}
		}
		System.out.println("The " + nth + " prime is " + number);
	}

}
