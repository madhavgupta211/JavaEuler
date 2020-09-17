
public class sumofPrimes {

	public static void main(String[] args) {
		final int limit = 2000001;
		long sumPrime = 0;
		boolean[] sieve = new boolean[limit];
		for(int i = 0; i < limit; i++ ) {
			sieve[i] = true;
		}
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < limit; i++) {
			if(sieve[i]) {
				sumPrime += i;
				for( int j = 2*i; j < limit; j += i ) {
					sieve[j] = false;
				}
			}
		}
		System.out.println("the sume of primes below " + limit + " is " + sumPrime);
	}

}
