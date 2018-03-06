package experements;

public class ArrayCalc {
	public static void main(String[] args){
		int[] newArray = {9,6,8,4,5,12};
		int n = newArray.length;
		int m = 0;
		int k = 0;
		for(int i=0;i<n;i++){
			if(newArray[i] %3 == 0 ){
				m = m + 1;
			}else if(newArray[i] %4 == 0){
				k = k + 1;
			}
		}
		System.out.print(m + " ");
		System.out.print(k + " ");
	}
}
