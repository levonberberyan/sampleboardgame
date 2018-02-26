package experements;

public class CaculatorFunctions {
	public static void main(String[] args){
		double n=2;
		double k=6;
		sumArray(n,k);
		multiplication(n,k);
		minus(n,k);
		bajanum(n,k);
	}
	public static void sumArray(double n,double k){
		double sum;
		sum = n + k;
		System.out.print(sum);
	}
	public static void multiplication(double n,double k){
		double multiplication;
		multiplication = n * k;
		System.out.print(multiplication);
	}
	public static void minus(double n,double k){
		double minus ;
		minus = n-k;
		System.out.print(minus);
	}
	public static void bajanum(double n,double k){
		double bajanum;
		bajanum = n / k;
		System.out.print(bajanum);
	}
}
