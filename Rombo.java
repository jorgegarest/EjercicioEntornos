package Rombo;

public class Rombo {

	public static void main(String[] args) {
		System.out.println("*** Rombo ***");
		// TODO Scanner
		// TODO comprabación impar

		int alturaRombo = 5;

		int alturaMitadRombo = (alturaRombo + 1) / 2;

		// Triángulo superior
		for (int fila = 1; fila <= alturaMitadRombo; fila++) {

			// Espacios
			for (int columna = 1; columna <= alturaMitadRombo - fila; columna++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int columna = 1; columna < (fila * 2); columna++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Triángulo inferior
		for (int fila = 1; fila < alturaMitadRombo; fila++) {

			// Espacios
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int columna = 1; columna < (alturaMitadRombo - fila) * 2; columna++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
