package experements;

import java.util.Scanner;

public class TaskWord {


	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] Array = {'H','e','l','l','o'};
		int lives = 5;
		int point = 0;
		while(lives>0 && point <= Array.length){
			char inputedSymbol = reader.nextLine().charAt(0);
			System.out.println("Your input is: " + inputedSymbol);
			for(int i=0;i<Array.length;i++){
				if(inputedSymbol == Array[i]){
					
					point++;
					
					System.out.println("Your point added one");
					if(inputedSymbol == Array[i]){
						System.out.println("You have already made this step");
					}
					break;
					
				}
				else{
					
					if(i == Array.length -1){
						lives--;
						System.out.println("Your Lives Decreasede");
					}
				}
			}
			
		}
		System.out.println("Your lives is: " +lives);
		System.out.println("Your point is: " +point);
		
	}	
}
