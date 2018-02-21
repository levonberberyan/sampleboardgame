package experements;

public class ArrayHandler {
	public static void main (String[] args){
		int[]  myStringArray = {4, 5, 8, 2, 3, 15};  
		//for (int i=0 ; i<myStringArray.length ; i++){
			//System.out.println(myStringArray [i]);
		//}
		int sum = 1;
		for (int i=0 ; i<myStringArray.length ; i++){
		
			sum *= myStringArray[i];
		
		}
		System.out.println(sum);
		//System.out.println(myStringArray [4] + " ");
	}
}
