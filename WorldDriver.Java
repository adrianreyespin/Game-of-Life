public class WorldDriver {
	public static void main (String[] args) {
		
		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);
	
		System.out.println("number of rows is " + r + " and number of columns is " + c);
		System.out.println("World: Created grid with " + r + " rows and " + c + " columns");
		
		World world = new World(r, c);
		world.initializeGrid();
		world.diagonals();
		world.printGrid();
		world.checkCells();
		
	}
}
