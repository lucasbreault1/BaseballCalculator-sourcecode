import java.text.DecimalFormat;
import java.util.Scanner;

public class Pitcher {

	private static DecimalFormat df = new DecimalFormat(".00");
		
	public static void pitcher() {
		Scanner input = new Scanner(System.in);
		System.out.println("The following stats are calculated from your input: ");
		System.out.print("Number of innings pitched? ");
		double innings = input.nextDouble();
		System.out.print("Number of earned runs allowed? ");
		int earnedRuns = input.nextInt();
		System.out.print("Number of strikeouts? ");
		int strikeouts = input.nextInt();
		System.out.print("Number of walks allowed? ");
		int walksAllowed = input.nextInt();
		System.out.print("Number of hits allowed? ");
		int hitsAllowed = input.nextInt();  
		
		//earned runs average method
		double era = earnedRunsAverage(innings, earnedRuns);
		System.out.println("ERA: " + df.format(era));
		
		//whip method
		double whip = walksHitsPerInning(hitsAllowed, walksAllowed, innings);
		System.out.println("WHIP: " +  df.format(whip));
		
		//strikeouts method
		double kPer9 = strikeoutsPerNineInnings(strikeouts, innings);
		System.out.println("K/9: " + df.format(kPer9));
	}
	
	//era formula
	public static double earnedRunsAverage(double innings, int earnedRuns) {
		double runsPerInning = earnedRuns / innings;
		double era = runsPerInning * 9;
		return era;
	}
	
	//whip formula
	public static double walksHitsPerInning(int hitsAllowed, int walksAllowed, double innings) {
		double hitsWalksTotal = hitsAllowed + walksAllowed;
		double whip = hitsWalksTotal / innings;
		return whip;
	}
	
	//striekouts per nine innings formula
	public static double strikeoutsPerNineInnings(int strikeouts, double innings) {
		double strikeoutsPerInning = strikeouts / innings;
		double kPer9 = strikeoutsPerInning * 9;
		return kPer9;
	}
}
