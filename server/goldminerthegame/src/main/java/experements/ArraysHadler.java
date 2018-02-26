package experements;

public class ArraysHadler {
	public static void main(String[] args){
		int[] zangvac = {1,2,3};
		int n = 3;
		arraySum(zangvac,n);
	}
	public static void arraySum(int[] zangvac,int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum = sum +zangvac[i];
		}
		System.out.println(sum);
	}
}
