import java.util.Scanner;
public class GameLife {
	public static void main (String args []){
		//row, col, row = col, generation, sleep rate, choice of display
		Scanner input = new Scanner(System.in);
		boolean contInput = true;
		int r = 0;
		int c = 0;
		int h = 0;
		int g = 0;
		int s = 1000;
		int choice = 0;
		//takes in user's input and makes sure the input is valid
			try {
				System.out.print("Enter in an integer greater than 39 for row and column size: ");
				h = input.nextInt();
				if (h <= 39){
					throw new Exception("Value is too small");
				}
				System.out.println();
				r = h;
				c = h;
				System.out.print("Choose one of the following: 1 (Glider), 2 (Pulsar), 3 (Glider Machine), 4 (Bee), or 5 (Spaceship): ");
				choice = input.nextInt();
				if (choice < 1 || choice > 5){
					throw new Exception("Invalid value");
				}
				System.out.println();
				System.out.print("Enter in an integer greater than 9 for number of generations: ");
				g = input.nextInt();
				if (g <= 9){
					throw new Exception("Value is too small");
				}
				System.out.println();
				System.out.print("Enter in an integer greater than 9 for sleep rate in milliseconds: ");
				s = input.nextInt();
				if (s <= 9){
					throw new Exception("Value is too small");
				}
				contInput = false;

			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
				System.out.println("Run the program again but this time make the input acceptable");
			}
		
		//from world class
		char[][] work = new char[r][c];
		World display = new World(r,c, work);
		

		display.initializeGrid();
		int count = 1;
		//depending on user choice, it will set the display with the pattern
			if (choice == 1){
				display.gliderChoice(4, 4);
			}
			if (choice == 2){
				display.pulsarChoice(10, 10);
			}
			if (choice == 3){
				display.machineChoice(4, 4);
			}
			if (choice == 4){
				display.beeChoice(10, 10);
			}
			if (choice == 5){
				display.spaceChoice(10, 10);
			}
		
		//while all conditions are met this will run
		while((count <= g) && (s > 9) && (g > 9))
		{	
			
			System.out.println("Generation: " + (count) + " (Ctrl-C to exit)");
			display.printGrid();
			
			display.copyGrid(h);
			
			count++;
			//helps run at sleep rate
			try
			{
				Thread.sleep(s);
			}
			catch(Exception ex)
			{
				System.out.println("Exception:"+ex.getStackTrace());
			}
		}
		//When project ends
		System.out.println("Thank you for playing Game of Life.");
	}
}
