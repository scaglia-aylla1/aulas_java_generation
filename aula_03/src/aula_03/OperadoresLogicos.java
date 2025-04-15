package aula_03;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		int z = 5;
		
		//Operadores relacionais
		System.out.printf("\n %d > %d = %b", x, y, (x > y));
		System.out.printf("\n %d < %d = %b", x, y, (x < y));
		System.out.printf("\n %d >= %d = %b", z, y, (z >= y));
		System.out.printf("\n %d <= %d = %b", z, y, (z <= y));
		
		//Operadores lógicos com comparações
		System.out.printf("\n (%d > %d) && (%d == %d) = %b", x, y, y, z, (x > y && y == z));
		System.out.printf("\n (%d < %d) || (%d != %d) = %b", x, y, y, z, (x < y || y != z));
		System.out.printf("\n !(%d >= %d) = %b", x, z, !(x >= z));

		
	}

}
