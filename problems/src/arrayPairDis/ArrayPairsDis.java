package arrayPairDis;

import java.util.HashMap;

/**
 * @author laplace
 *
 * Count all pairs of distinct integers with distance k.
 */
public class ArrayPairsDis {
	
	private static final int[] array = {1,7,5,9,2,12,3};
	private final static int k = 2;
	private static int count;
	private static HashMap<Integer,Integer> hashM = new HashMap<>();
	
	/**
	 * Creates a hash map from array where keys are a element minus k.
	 * Runtime of O(n) where in is the number of elements in the array.
	 * @param array
	 */
	private static void createHash( ) {
		for ( int i : array ) {
			int key = i-k;
			hashM.put(key, i);
		}
	}
	
	/**
	 * Counts the pairs with distance k.  
	 * Runtime again is O(n)
	 */
	private static void countPairs() {
		for ( int i : array ) {
			if ( hashM.containsKey(i) ) {
				count+=1;
			}
		}
	}
	
	public static void main(String[] args) {
		createHash(); // O(n)
		countPairs(); // O(n)
		// total runtime of O(n) + O(n) = O(n)
		System.out.print(count);
	}

}
