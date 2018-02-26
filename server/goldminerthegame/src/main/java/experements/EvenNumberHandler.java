package experements;

public class EvenNumberHandler {
	public static void main(String[] args){
		int n = 5;
		int sum = 0;
		for(int i= 1;i<= n;i = i + 2){
			sum = sum + i;
		}	
		System.out.println(sum);
	}
}
