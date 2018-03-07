package experements;

public class FirstProgram {
	public static void main (String[] args){
		System.out.println("it Works!");
		char cellValue = CellSaver.getCell(1,2);
		char cellValueOne = CellSaver.getCell(0,1);
		System.out.println(cellValue);
		System.out.println(cellValueOne);
		int sum = FirstProgram.add(4, 5);
		System.out.println(sum);
		int sum1 = FirstProgram.sub(8, 2);
		System.out.println(sum1);
		FirstProgram.print();
		FirstProgram.printSymbolAndNumber("Poghosyan");
	}
	public static int add (int x, int y){
		int z;
		z = x + y;
		return z;
	}
	public static int sub (int x, int y) {
		int k;
		k=x - y;
		return k;
	}
	public static void print(){
		System.out.println("Asala maleykum");
	}
	public static void printSymbolAndNumber(String name){
		System.out.println(name + " 96");
	}
	
	
}
