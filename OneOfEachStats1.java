/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		
		double sum_all= 0.0;
		double averege = 0.0;
		int twochildren = 0;
		int threechildren = 0;
		int fourchildren = 0;
		String common ;
		
			for (int i = 0; i < t; i++){
				boolean girl = false; 
				boolean boy = false;
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
			sum_all += sum;	
			if (sum == 2) {	
				twochildren ++;
			}
			else if (sum == 3) {
				threechildren ++;
			}
			else if (sum >= 4) {
				fourchildren ++;
			}
			
		}
		
		averege = sum_all / t ; 

		if (twochildren >= threechildren && twochildren >= fourchildren){
			common = "2.";
		}
		else if (threechildren >= twochildren && threechildren >= fourchildren){
			common = "3.";
		}
		else{
			common="4 or more.";
		}
		
		System.out.println("Averege: " + averege + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ twochildren);
		System.out.println("Number of families with 3 children: "+ threechildren);
		System.out.println("Number of families with 4 or more children: "+ fourchildren);
		System.out.println("The most common number of children is "+ common);
	}
}



