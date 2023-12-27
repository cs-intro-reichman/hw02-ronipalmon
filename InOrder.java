/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int a = 0;
		int b = 0;
		boolean check = true ;

	while (check) {
		b = a;
		a = (int) ((Math.random() * 10) );
		if (b > a) {
			check = false ;
		}
		else {
			System.out.print(a +" ");
		}

	}
	}
}