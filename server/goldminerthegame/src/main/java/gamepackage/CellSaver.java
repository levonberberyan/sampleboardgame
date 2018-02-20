package gamepackage;

public class CellSaver {
	private static char[][] cellsMatrix = { {'E' , '$' , 'G' } , 
											{'B' , 'B' , ')' } , 
											{'#' , 'E' , 'G' }};
	public static char getCell(int x, int y){
			return cellsMatrix[x][y];
	}
	public static boolean isValid(int x, int y){
		if(x>0 && x<cellsMatrix.length && y>0 && y<cellsMatrix[0].length){
			return true;
		}
		else{
			return false;
		}
	}
}