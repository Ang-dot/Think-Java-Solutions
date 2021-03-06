/**
 * Create multiple 2D arrays. 
 * Created a method to return an element in a 2D array.
 * 
 * 
 * Created a method to display a 2D array in the same format that you assign one, e.g. {{2,4,6,8},{5,6,2,1},{1,3,2}}
 * 
 * @author Quan Truong
 * 
 */

public class TableforMultiArrays {

	public static void main(String[] args) {
		// multi-dimensional array
		int firstArray[][] = { { 8, 9, 10, 12 }, { 12, 13, 14, 15 } };
		// has 3 rows {every bracket is a row}
		// the first brackets is [0][x]
		int secondArray[][] = { { 30, 31, 32, 33 }, { 43 }, { 4, 5, 6 } };

		System.out.println("This is the first array: ");
		display(firstArray);
		
		System.out.println();
		
		System.out.println("This is the second array:");
		display(secondArray);
	}

	public static void display(int x[][]) {

		// loop through the rows
		for (int row = 0; row < x.length; row++) {
			// then loop through the columns
			for (int column = 0; column < x[row].length; column++) {
				// row starts at 0, then loops through columns.. once all
				// columns are looped, then row gets
				// incremented by 1 and columns get looped through again
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int returnElement(int[][] array, int row, int col) {
		return array[row][col];
	}

	/**
	 * Returns a 2D array in the same format as when you assign it. Manually
	 * displays a 2D array as they are assigned.
	 * 
	 * Also, there are if and else statements which handle the formatting of the output.
	 * 
	 * @param x
	 *            The 2D array to be formatted.
	 */
	public static void displayLikeAnArray(int[][] x) {
		System.err.print("{");
		// loop through rows and display every element
		for (int row = 0; row < x.length; row++) {
			System.out.print("{");
			for (int col = 0; col < x[row].length; col++) {
				// if it's the last element, forego putting the comma after the
				// array element
				if ((col == (x[row].length - 1))) {
					System.out.print(x[row][col]);
				} else {
					System.out.print(x[row][col] + ", ");
				}
			}

			// if it's the last element of a row, don't put a comma after it
			// this handles the very last "}"
			if (row == x.length - 1) {
				System.out.print("}");
			} else {
				System.out.print("}, ");
			}
		}
		System.out.println("}");
	}
}
