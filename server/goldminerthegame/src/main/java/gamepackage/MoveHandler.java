package gamepackage;

public class MoveHandler {
	public static void resetGameIfEnd(int y,int x){
		if(goldNumber == 3 ||  lives == 0){
			goldNumber = 0;
			lives = 3;
			for(int i = 0 ; i <hidenMatrix.length ;i++)
				for(int j = 0;j <hidenMatrix[0].length ;j++){
					hidenMatrix[y][x] = '*';
			}
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
		result += "Gold" + " " + goldNumber + " " ;
		result += "Lives" + " " + lives + " ";
		result += "Value" + " " + hidenMatrix[y][x] + " ";
		return result;
	}
	
	public static String makeMove(int y , int x){
		
		String result ="";
		if(isValid(y, x)==false){
			return "Your cordinats are incorect";
		}
		if(hidenMatrix[y][x] == cellsMatrix[y][x]){
			return "You have already made this step";
		}
		hidenMatrix[y][x] = cellsMatrix[y][x];
	
		result += checkGameEffects(y,x);
		result += chechWinOrLose(lives,goldNumber);
		resetGameIfEnd(y,x);
		return result;
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
}
