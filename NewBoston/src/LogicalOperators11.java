import java.util.Scanner;

public class LogicalOperators11 {

	/**
	 * Takes a name, and then displays "hello, " + name
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		
		//ask user for their name
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		name = in.nextLine();
		
		//use simpleMessage from tuna class in same directory
		tuna tunaObject = new tuna();
		tunaObject.simpleMessage(name);
		

	}
	
	/**
	 * A simple method for a dating site that tells you whether you are allowed to enter based on your age and gender.
	 * @param boy
	 * @param girl
	 */
	public static void allowedToEnter(int boy, int girl) {
		
		if (boy > 10 || girl < 60) {
			System.out.println("You can enter since you are over 10 and under 30" );
		} else { 
			System.out.println("You can't enter");
		}
	}

}
