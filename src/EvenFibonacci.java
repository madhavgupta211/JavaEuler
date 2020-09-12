
public class EvenFibonacci {

	public static void main(String[] args) {
		final int FIRST = 1;
		final int SECOND = 2;
		final int LIMITER = 4000000;
		int prev = FIRST;
		int curr = SECOND;
		int temp;
		long sum = 0; 
		while( curr <= LIMITER ) {
			if( curr % 2 == 0) {
				sum += curr;
			}
			temp = curr + prev;
			prev = curr;
			curr = temp;
		}
		System.out.println("the Sum is: " + sum);
	}

}
