package Exercises;

public class PracticeReading82 {

	public static void main(String[] args) {
		
		//Create an array to test banana
		int[] a = {1,2,3,4,5,6};
		System.out.println(banana(a));
		
		System.out.println(pineapple(a,7));
		

	}
	
	/**
	 * Multiples every value in an array.
	 * @param a
	 * 			The array to multiply. 
	 * @return
	 * 			Returns the sum of every element in the array multiplied by itself.
	 */
	public static int banana(int[] a) {
		int kiwi = 1;
		int i = 0;
		while ( i < a.length ) {
			kiwi = kiwi * a[i];
			i++;
		}
		return kiwi;
	}
	
	
	/**
	 * Searches for a target in an array and tells you the indice of where it was found.
	 * @param a
	 * 				The array to search in.
	 * @param grape
	 * 				The target to search for.
	 * @return
	 * 				The indice of the target is returned if found. If not found, -1 is returned. 
	 */
	public static int grapefruit(int[] a, int grape) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == grape) {
				return i;
				
			}
		}
		//Return -1 if target was not found
		return -1;
	}
	
	/**
	 * Search for a target in an array and return how many times it shows up.
	 * @param a
	 *  The array to search in.
	 * @param apple
	 * 	The target to search for.
	 * @return pear
	 *  The amount of times the target showed up.
	 */
	public static int pineapple(int[] a, int apple) {
		
		//The counter
		int pear = 0;
		
		for (int pine:a) {
			if (pine== apple){
				pear++;
			}
		}
		return pear;
	}

}
