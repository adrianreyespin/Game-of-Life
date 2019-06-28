public class World {

	private char[][] worldGrid;
	private char[][] workGrid;
	private int r;
	private int c;
	//contructor
	public World(){
		r = 0;
		c = 0;
		worldGrid = new char[0][0];
	}
	//specific constructor
	public World(int r, int c, char[][] workGrid){
		this.r = r;
		this.c = c;
		worldGrid = new char[r][c];
		this.workGrid = workGrid;
		}
	
	//if user chooses Glider
	public void gliderChoice(int r, int c){
		char[][] glider = {{' ','*',' '},
 						   {' ',' ','*'},
 						   {'*','*','*'}
 						};
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+glider.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+glider.length); j++)
			{
				worldGrid[i][j] = glider[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}
	}
	//if user chooses Pulsar
	public void pulsarChoice(int r, int c){
		char[][] pulsar = {{' ', ' ', '*', '*', '*', ' ', ' ', ' ', '*', '*', '*', ' ', ' '},
						   {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {' ', ' ', '*', '*', '*', ' ', ' ', ' ', '*', '*', '*', ' ', ' '},
						   {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						   {' ', ' ', '*', '*', '*', ' ', ' ', ' ', '*', '*', '*', ' ', ' '},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {'*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
						   {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						   {' ', ' ', '*', '*', '*', ' ', ' ', ' ', '*', '*', '*', ' ', ' '}};
						   
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+pulsar.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+pulsar.length); j++)
			{
				worldGrid[i][j] = pulsar[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}

	}
	//if user chooses Glider Machine
	public void machineChoice(int r, int c){
		
		char[][] gliderMachine = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*'},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*'},
								  {'*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {'*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', '*', '*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
								  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
								  
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+gliderMachine.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+gliderMachine.length); j++)
			{
				worldGrid[i][j] = gliderMachine[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}
	}
	//If user chooses spaceship
	public void spaceChoice(int r, int c){
		
		char[][] space = {{'*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						  {'*', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' '},
						  {'*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', '*', '*', '*'},
						  {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', '*', '*', '*', '*'},
						  {' ', ' ', ' ', '*', '*', ' ', ' ', ' ', '*', '*', ' ', '*', '*', ' ', ' ', '*', '*', ' '},
						  {' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' '},	
						  {' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', '*', '*', ' ', ' ', ' ', '*', '*', ' ', '*', '*', ' ', ' ', '*', '*', ' '},
						  {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', '*', '*', '*', '*'},
						  {'*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', '*', '*', '*'},
						  {'*', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' '},
						  {'*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
						   

						
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+space.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+space.length); j++)
			{
				worldGrid[i][j] = space[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}

	}
	//If user chooses bee
	public void beeChoice(int r, int c){
		
		char[][] bee = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},	
						{'*', '*', ' ', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*'},
						{'*', '*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*'},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

						
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+bee.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+bee.length); j++)
			{
				worldGrid[i][j] = bee[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}

	}
	
	
	//This initializes the grid with empty spaces	
	public void initializeGrid(){
	
		for(int i = 0; i < r; i++){	
			for(int j = 0; j < c; j++){
				
					worldGrid[i][j] = ' ';
				}
			}
		}
	
	//This will make both 2D arrays work with each other
	public void copyGrid(int h){
		//this passes the display into the work grid
		for(int i = 0; i < worldGrid.length; i++){	
			for(int j = 0; j < worldGrid[i].length; j++){
				workGrid[i][j] = worldGrid[i][j];
			}
		}
		//the work grid checks each element and changes them if needed on the display
		for(int i = 0; i < workGrid.length; i++){	
			for(int j = 0; j < workGrid[i].length; j++){
				int countCheck = 0;
				//checking top left
				if (i == 0 && j == 0){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				//checking top edge
				if ((i == 0) && (j > 0) && (j < h-1)){
					//if cell
					if (workGrid[i][j] == '*'){
						
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
					
				
				}
				//checking top right corner
				if ((i == 0) && (j == h-1)){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				
				//checking right edge
				if ((i > 0) && (i < (h-1)) && (j == (h-1))){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				//checking for right corner
				if ((i == (h-1)) && (j == (h-1))){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				
				//checking for bottom edge
				if ((i == (h-1)) && (j > 0) && (j < (h-1))){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				
				//checking for bottom left corner
				if ((i == (h-1)) && (j == 0)){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				
				//check for left edge
				if ((i > 0) && (i < h-1) && (j == 0)){
					//if cell
					if (workGrid[i][j] == '*'){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
					//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
				//the rest
				if (((i >= 1) && (i <= (h-2))) && ((j >= 1) && (j <= (h-2)))){
				//if cell
				
					if (workGrid[i][j] == '*'){
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (countCheck < 2 || countCheck > 3){
							worldGrid[i][j] = ' ';
						}
						if (countCheck == 2 || countCheck == 3){
							worldGrid[i][j] = '*';
						}
					}
				//if dead
					if (workGrid[i][j] == ' '){
						if (workGrid[i-1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i-1][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i][j+1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j-1] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j] == '*'){
							countCheck++;
						}
						if (workGrid[i+1][j+1] == '*'){
							countCheck++;
						}
						if (countCheck == 3){
							worldGrid[i][j] = '*';
						}
						if (countCheck != 3){
							worldGrid[i][j] = ' ';
						}
					}
				}
			}
		}
				
	}
	//prints grid	
	public void printGrid(){
	
		for(int i = 0; i < worldGrid.length; i++){	
			for(int j = 0; j < worldGrid[i].length; j++){
				
				System.out.print(worldGrid[i][j]);
			}
		System.out.println();
		}
	}
}
