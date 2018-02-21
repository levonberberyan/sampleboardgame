package pract;

public class Adder {

	public static void main(String[] args) {
		int a=2;
		int b=5;
		System.out.println(Adder.add(a, b));
		Adder.multiply(a, b);
	}
	public static int add(int a, int b) {
		int f;
		f=a+b;
		return f;
	}
	public static void multiply(int a,int b){
		int g;
		int l=4;
		g=a+b+l;
		System.out.println(g);
	}
}
