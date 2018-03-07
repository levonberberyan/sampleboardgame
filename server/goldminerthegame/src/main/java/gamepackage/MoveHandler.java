package gamepackage;

import java.util.Random;

public class MoveHandler {
	public static void resetGameIfEnd(int y,int x){
		if(goldNumber == 3 ||  lives == 0){
			goldNumber = 0;
			lives = 3;
			for(int i = 0 ; i <hidenMatrix.length ;i++)
				for(int j = 0;j <hidenMatrix[0].length ;j++){
					hidenMatrix[y][x] = '*';
			}
			start = true;
		}
	}
	
	public static String chechWinOrLose(int lives , int goldNumber){
		String result = "";
		if(lives == 0){
			result += "Game Over";
		}
		if(goldNumber == goldTotal){
			result += "You Win  ";
		}
		return result;
	}
	
	public static String checkGameEffects(int y,int x){
		String result = "";
		if(hidenMatrix[y][x] == 'B' ){
			lives--;
			result += "Your Lives Decreased  ";
			System.out.print("Result = " + result);
		}else if(hidenMatrix[y][x] == 'G'){
			goldNumber ++;
			result += "Your Gold Number Increased  ";
		}
		return result;
	}
	public static void swap(char[][] matrix,int i,int j,int k,int l){
		char mid = matrix[i][j];
		matrix[i][j] = matrix[k][l];
		matrix[k][l] = mid;
	}
	
	public static void shuffle(char[][] matrix){
		int n = matrix.length;
		int m = matrix[0].length;
		Random gen = new Random();
		for(int i = n; i > 1; i--)
			for(int j = m; j > 1; j--){
				int ri = gen.nextInt(i);
				int rj = gen.nextInt(j);
				swap(matrix,i-1,j-1,ri,rj);
			}
	}
	public static void buildBoard(int length,int height){
		cellsMatrix = new char[length][height];
		int bombs = (length*height)/3;
		int golds = (length*height)/2;
		int empties =  (length*height) - bombs - golds;
		int bombsNumber = 0;
		int goldsNumber = 0;
		int emptyNumber = 0;
		for(int i=0;i<length;i++)
			for(int j=0;j<height;j++){
				if(bombsNumber < bombs){
					cellsMatrix[i][j] = 'B';
					bombsNumber++;
				}else if(goldsNumber < golds){
					cellsMatrix[i][j] = 'G';
					goldsNumber++;
				}else if(emptyNumber < empties){
					cellsMatrix[i][j] = 'E';
					emptyNumber++;
				}
			}
		shuffle(cellsMatrix);
		
		hidenMatrix = new char[length][height];
		for(int i=0;i<length;i++)
			for(int j=0;j<height;j++){
				hidenMatrix[i][j] = '*';
			}
	}
	
	public static MoveEffects makeMove(int y , int x){
		MoveEffects effects = new MoveEffects();
		if(start == true){
			buildBoard(3,3);
			start = false;
		}
		effects.setStatus("Game in progress");
		effects.setGold(goldNumber);
		effects.setLives(lives);
		effects.setInfo("Your cordinats are incorect");
		effects.setValue(' ');
		if(isValid(y, x)==false){
			effects.setStatus(status);
			return effects;
		}
		if(hidenMatrix[y][x] == cellsMatrix[y][x]){
			effects.setInfo("You have already made this step");
			return effects;
		}
		
		hidenMatrix[y][x] = cellsMatrix[y][x];
		effects.setInfo(checkGameEffects(y,x));
		effects.setGold(goldNumber);
		effects.setLives(lives);
		effects.setValue(hidenMatrix[y][x]);
		effects.setStatus(chechWinOrLose(lives,goldNumber));
		resetGameIfEnd(y,x);
		return effects;
	}
	
	public static boolean isValid(int y, int x){
		if(y>=0 && y<cellsMatrix.length && x>=0 && x<cellsMatrix[0].length){
			return true;
		}
		return false;
	}
	
	public static char getCell(int y, int x){
		return cellsMatrix[y][x];
	}
	
	private static char[][] cellsMatrix;
	private static char[][] hidenMatrix;
	private static boolean start = true;
	private static String status;
	private static int lives = 3;
	private static int goldNumber = 0;
	private static int goldTotal = 3;
}