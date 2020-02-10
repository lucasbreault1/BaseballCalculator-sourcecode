import java.text.DecimalFormat;
import java.util.Scanner;

public class Stealer {

	private static DecimalFormat df = new DecimalFormat(".00");
		
	public static void stealer() {
		Scanner input = new Scanner(System.in);
		System.out.println("The following stats are calculated from your input: ");
		System.out.print("Number of stolen bases? ");
		int steals = input.nextInt();
		System.out.print("Number of times caught stealing? ");
		int caught = input.nextInt();
		
		//stolen base percentage method
		double stealPercent = stolenBasePercentage(steals, caught);
		System.out.println("Stolen Base %: " + df.format(stealPercent));
		
	}
	
	//stolen base percentage formula
	public static double stolenBasePercentage(int steals, int caught) {
		double totalAttempts = steals + caught;
		double stealPercent = steals / totalAttempts;
		return stealPercent;
	}
	
}