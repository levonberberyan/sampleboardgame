package gamepackage;

public class CellSaver {
	private static char[][] cellsMatrix = { {'E' , 'G' , 'G' } , 
											{'B' , 'B' , 'B' } , 
											{'B' , 'E' , 'G' }
	};
	private static char[][] hidenMatrix = { {'*' , '*' , '*' },
											{'*' , '*' , '*' },
											{'*' , '*' , '*' }
	};
	private static int lives = 3;
	private static int goldNumber = 0;
	private static int goldTotal = 3;
	public static char getCell(int y, int x){
			return cellsMatrix[y][x];
	}
	public static boolean isValid(int y, int x){
		if(y>=0 && y<cellsMatrix.length && x>=0 && x<cellsMatrix[0].length){
			return true;
		}
		
		return false;
	}
	public static String makeMove(int y , int x){
		String result ="";
		if(isValid(y, x)==false){
			return "Your cordinats are incorect";
		}
		hidenMatrix[y][x] = cellsMatrix[y][x];
		if(hidenMatrix[y][x] == 'B' ){
			lives--;
			result += "Your Lives Decreased  ";
		}else if(hidenMatrix[y][x] == 'G'){
			goldNumber ++;
			result += "Your Gold Number Increased  ";
		}
		result += "Gold" + " " + goldNumber + " " ;
		result += "Lives" + " " + lives + " ";
		result += "Value" + " " + hidenMatrix[y][x] + " ";
		
		if(lives == 0){
			result += "Game Over";
		}
		if(goldNumber == goldTotal){
			result += "You Win  ";
		}
		if(goldNumber == 3 ||  lives == 0){
			goldNumber = 0;
			lives = 3;
			for(int i = 0 ; i <hidenMatrix.length ;i++)
				for(int j = 0;j <hidenMatrix[0].length ;j++){
					hidenMatrix[y][x] = '*';
			}
		}
		
		return result;
	}
}