package arrayPairDis;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * @author laplace
 *
 * Count all pairs of distinct integers with distance k.
 */
public class ArrayPairsDis {
	
	int[] array = {1,7,5,9,2,12,3};
	int k = 2;
	HashMap<Integer,Integer> hashM = null;
	
	/**
	 * Creates a hash map from array where keys are a element minus k.
	 * @param array
	 */
	private void createHash( int[] array ) {
		for ( int i : array ) {
			int key = i-k;
			hashM.put(key, i);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
