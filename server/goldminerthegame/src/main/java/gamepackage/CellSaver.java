package gamepackage;

public class CellSaver {
	private static char[][] cellsMatrix = { {'E' , '$' , 'G' } , 
											{'B' , 'B' , ')' } , 
											{'#' , 'E' , 'G' }
	};
	private static char[][] hidenMatrix = { {'*' , '*' , '*' },
											{'*' , '*' , '*' },
											{'*' , '*' , '*' }
	};
	private static int lives = 3;
	private static int goldNumber = 0;
	public static char getCell(int y, int x){
			return cellsMatrix[y][x];
	}
	public static boolean isValid(int y, int x){
		if(y>=0 && y<cellsMatrix.length && x>=0 && x<cellsMatrix[0].length){
			return true;
		}
		
		return false;
	}
	public static boolean makeMove(int y , int x){
		if(isValid(y, x)==false){
			return false;
		}
		hidenMatrix[y][x] = cellsMatrix[y][x];
		if(hidenMatrix[y][x] == 'B' ){
			lives--;
		}
		else if(hidenMatrix[y][x] == 'G'){
			goldNumber ++;
			
		}
		return true;
	}
}