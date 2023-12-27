/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		boolean girl = false; 
		boolean boy = false;
		int sum = 0;
		int sum_all= 0;
		double averege = 0;
		
			for (int i = 0; i <= t; i++){
				while(girl == false || boy == false){
					double a = (Math.random() );
					if (a >= 0.5){
						girl = true;
						System.out.print("g ");
					}

					else {
						boy = true;
						System.out.print("b ");
					}
					sum += 1;
			}	
			sum_all += sum;
			averege = sum_all / t ; 
			System.out.println("Averege: " + averege + " children to get at least one of each gender.");
		}
		
	}
	}


