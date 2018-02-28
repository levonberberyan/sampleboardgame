package experements;

import java.util.Random;

public class RandomFunctions {
	public static void main(String[] args){
		Random generator = new Random();
		int[] randomArray = {0,6,8,7,9};
		int n = randomArray.length;
		//int randomNumber = generator.nextInt(4);
		//System.out.print(randomNumber);
		for(int i=0;i<n;i++){
			//System.out.print(randomArray[i] + " ");
			
		}
		int[] randomArrayOne = {4,5,7,2,5};
		for(int i = 0;i<n;i++){
			if (i==n-1){
				randomArrayOne[i] = randomArray[0];
			}
			else{
				randomArrayOne[i] = randomArray[i+1];
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(randomArrayOne[i] + " ");
		}
		
	}
}
