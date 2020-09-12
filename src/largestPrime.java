import java.lang.Math;

public class largestPrime {

	public static void main(String[] args) {
		long sum = 600851475143L;
		long maxp = 0;
		long root = (long)(Math.sqrt(sum));
		for( long i = 3; i <= root; i += 2 ) {
			while( sum % i ==0 ) {
				maxp = i;
				sum = sum / i;
			}
		}
		System.out.println(maxp);
	}
	
}
