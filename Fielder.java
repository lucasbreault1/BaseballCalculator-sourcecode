import java.util.Scanner;

public class Fielder {
		
	public static void fielder() {
		Scanner input = new Scanner(System.in);
		System.out.println("The following stats are calculated from your input: ");
		System.out.print("Number of putouts? ");
		int putouts = input.nextInt();
		System.out.print("Number of assists? ");
		int assists = input.nextInt();
		System.out.print("Number of errors? ");
		int errors = input.nextInt();
		
		//fielding percentage method
		double fPercent = fieldingPercentage(putouts, assists, errors);
		System.out.println("Fielding %: " + fPercent);
		
	}
	
	//fielding percentage formula
	public static double fieldingPercentage(int putouts, int assists, int errors) {
		double successOuts = putouts + assists;
		double totalChances = successOuts + errors;
		double fPercent = successOuts / totalChances;
		return fPercent;
	}
	
}