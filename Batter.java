import java.text.DecimalFormat;
import java.util.Scanner;

public class Batter {
	//Decimal format for statistics generated
	private static DecimalFormat df = new DecimalFormat(".000");
	
	public static void batter() {
		//Scanner created
		Scanner input = new Scanner(System.in);
		//Required input from the user
		System.out.println("The following stats are calculated from your input: ");
		System.out.print("Number of at bats? ");
		int atBats = input.nextInt();
		System.out.print("Number of hits? ");
		int hits = input.nextInt();
		System.out.print("Number of singles? ");
		int singles = input.nextInt();
		System.out.print("Number of doubles? ");
		int doubles = input.nextInt();
		System.out.print("Number of triples? ");
		int triples = input.nextInt();
		System.out.print("Number of home runs? ");
		int homeruns = input.nextInt();
		System.out.print("Number of walks? ");
		int walks = input.nextInt();
		System.out.print("Number of hit by pitches? ");
		int hbp = input.nextInt();
		System.out.print("Number of sacrifices? ");
		int sac = input.nextInt(); 
		
		//batting average method
		double average = battingAverage(hits, atBats);
		System.out.println("Batting Average: " + df.format(average));
		
		//on base percentage method
		double obp = onBasePercentage(hits, walks, hbp, atBats, sac);
		System.out.println("OBP: " + df.format(obp));
		
		//slugging percentage method
		double slug = sluggingPercentage(singles, doubles, triples, homeruns, atBats);
		System.out.println("Slugging%: " + df.format(slug));
	}
	
	//batting average formula
	public static double battingAverage(int hits, int atBats) {
		return (double) hits / atBats;
	}
	
	//on base percentage formula
	public static double onBasePercentage(int hits, int walks, int hbp, int atBats, int sac) {
		double hitsWalksHbp = hits + walks + hbp;
		double atBatsWalksHbpSac = atBats + walks + hbp + sac;
		double obp = hitsWalksHbp / atBatsWalksHbpSac;
		return obp;
	}
	
	//slugging percentage formula
	public static double sluggingPercentage(int singles, int doubles, int triples, int homeruns, int atBats) {
		double totalBases = 0;
	      totalBases += singles;
	      totalBases += doubles * 2;
	      totalBases += triples * 3;
	      totalBases += homeruns * 4;
		double slug = totalBases / atBats;
		return slug;
	}
}