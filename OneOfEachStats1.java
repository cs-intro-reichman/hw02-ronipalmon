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
		int sum_all= 0;
		double averege = 0.0;
		int twochildren = 0;
		int threechildren = 0;
		int fourchildren = 0;
		int common = 0 ;
		
			for (int i = 0; i <= t; i++){
				int sum = 0;
				while(girl == false || boy == false){
					double a = (Math.random() );
					if (a >= 0.5){
						girl = true;
					}

					else {
						boy = true;
					}
					sum ++ ;
			}
			if (sum == 2) {	
				twochildren ++;
			}
			else if (sum == 3) {
				threechildren ++;
			}
			else {
				fourchildren ++;
			}

			sum_all += sum;	
		}
		
		averege = sum_all / t ; 
		common = Math.max(Math.max(twochildren,threechildren),fourchildren);
		System.out.println("Averege: " + averege + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ twochildren);
		System.out.println("Number of families with 3 children: "+ threechildren);
		System.out.println("Number of families with 4 or more children: "+ fourchildren);
		System.out.println("The most common number of children is "+ common);
	}
}



