package experements;

import java.util.Random;

/**
 * @author Developer
 *
 */
public class ArraysHadler {
	public static void swap(int[] arr, int i, int j){
		int c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	public static void main(String[] args){
		int[] newArray = {0, 5, 4, 8, 9, 6, 4};
		int n = newArray.length;
		Random generator = new Random();
		for(int i = n-1; i > 1; i--){
			int ri = generator.nextInt(i-1);
			swap(newArray, i, ri);
		}
		for (int i=0 ; i< n ; i++){
			System.out.print(newArray[i] + " ");
		}
	}	
}
