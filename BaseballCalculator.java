import java.util.Scanner;
class BaseballCalculator {
	//Main method created
	public static void main(String[] args) {
		//Scanner created
		Scanner input = new Scanner(System.in);
		//Introduction message
		System.out.println("This program calculates the stats of a baseball player (pitching, batting, fielding, stealing) based off of the user's input!");
		//While loop created to ask user for input
		while (true) {
			//Giving the user input options
			System.out.println("Would you like to enter the stats of a pitcher(1), batter(2), fielder(3), stealer(4), or NO(0)?: ");
			//choice integer variable created
			int choice = input.nextInt();
			if (choice == 1) {
				pitcher(input);
			}
			if (choice == 2) {
				batter(input);
			}
			if (choice == 3) {
				fielder(input);
			}
			if (choice == 4) {
				stealer(input);
			}
			if (choice == 0) {
				return;
			}
			//asks question again if incorrect input and after their  previous selection is completed
			else { 
				
			}
			
		}
		
	}
	public static void pitcher(Scanner input) {
		Pitcher p = new Pitcher();
		p.pitcher();
	}
	public static void batter(Scanner input) {
		Batter b = new Batter();
		b.batter();
	}
	public static void fielder(Scanner input) {
		Fielder f = new Fielder();
		f.fielder();
	}
	public static void stealer(Scanner input) {
		Stealer s = new Stealer();
		s.stealer();
	}

}