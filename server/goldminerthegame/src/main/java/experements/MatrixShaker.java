package experements;

import java.util.Random;

public class MatrixShaker {
	public static void swap(int[][] arr, int i, int j, int k, int l){
		int c = arr[i][j];
		arr[i][j] = arr[k][l];
		arr[k][l] = c;
	}
	public static void main(String[] args){
		int[][] cellsMatrix = { {3 , 4 , 5, 4 } , 
								{10 , 3, 4, 7 } , 
								{12 , 6, 3, 8 }
		};
		int n = cellsMatrix.length;
		int m = cellsMatrix[0].length;
		Random generator = new Random();
		for(int i = n-1; i > 1; i--)
			for(int j = m-1; j > 1; j--){
				int ri = generator.nextInt(i-1);
				int rj = generator.nextInt(j-1);
				swap(cellsMatrix,i,j,ri,rj);
		}
		for(int i = 0 ; i <cellsMatrix.length ;i++)
			for(int j = 0;j <cellsMatrix[0].length ;j++){
				System.out.print(cellsMatrix[i][j] + " ");
		}
	}
	
}
