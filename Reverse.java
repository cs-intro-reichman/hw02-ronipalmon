/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String x = args[0];
		String xOut = "";
		int n= x.length();
	
		for (int i= n-1; i >= 0 ; i= i-1 ) { 
			char a = x.charAt(i);
			xOut= xOut + a;
		}
		System.out.println(xOut);
		System.out.println("The middle character is " + x.charAt( (n-1) / 2));

		
	}
}
