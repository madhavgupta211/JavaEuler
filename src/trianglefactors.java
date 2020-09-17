
public class trianglefactors {

	public static void main(String[] args) {
		final int threshold = 500;
		int factors = 0;
		int i = 1;
		int j = 2;
		while(true) {
			factors = nfactors(i);
			if( factors >= threshold ) {
				break;
			}
			int next = j++;
			i += next;
		}
		System.out.println(i);
	}
	
	public static int nfactors(int i) {
		if(i == 1) {
			return 1;
		}
		if(i == 0) {
			return 0;
		}
		int counter = 0;
		for( int k = 1; k <= (int)Math.sqrt(i); k++ ) {
			if( i % k == 0 ) {
				counter += 2;
			}
		}
		return counter;
	}

}
