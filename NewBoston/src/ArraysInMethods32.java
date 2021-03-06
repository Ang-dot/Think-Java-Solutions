

/**
 * 32 Arrays in Methods: https://www.youtube.com/watch?v=rzXoz2KOP7E&list=PLFE2CE09D83EE3E28&index=32
 * 
 * @author Quan Truong
 *
 */
public class ArraysInMethods32 {

	public static void main(String[] args) {
		//initialize array
		int[] quan = {2,4,6,8,10,12};
		
		change(quan);
		//print every variable in the array using for loop
		for (int count:quan) {
			System.out.println(count);
		}
		
	}
	
	
	//create method that squares changes each variable in an array
	public static void change(int[] x) {
		//create for loop to square every element
		for (int i = 0; i<x.length; i++) {
			x[i]*=x[i];
		}
	}
	

}
