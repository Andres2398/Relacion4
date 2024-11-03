package poderoso;

import java.util.Scanner;

public class Poderoso {

	public static void main(String[] args) {
		
		
		//PREGUNTAR A JUAN CARLOS POR EL WHILE CON BREAK
		
		int numero = 0;
		boolean poderoso = true;

		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			if (numero % 4 != 0) { // Comprobar que los numeros pares tienen como divisor el 2^2 (pimer primo)
				poderoso = false;
			}
		}

		boolean esdivisor = false;
		int divisor = 0;
		boolean divisorPrimo = true;
		int potencia = 0;
		int j = 2;
		int i = 3;
		while (i <= numero / 2 && poderoso == true) {

			if (numero % i == 0) { 			// Sacar divisores del numero
				divisor = i;
				esdivisor = true;

			}

			while (j <= divisor / 2 && esdivisor == true) {

				if (divisor % j == 0) {			 // comprobar que los divisores son primos
					divisorPrimo = false;

				}

				if (divisorPrimo == true) { 		// calcular el divisor al cuadrado
					potencia = divisor * divisor;

				}
				j++;
			}
			
			while (potencia != 0) { 			// solo entrar si potencia es difente a 0
				if (numero % potencia == 0) {	// numero % primo^2

					poderoso = true;

				} else {
					poderoso = false;

				}
				break;

			}

			i++;

		}

		if (poderoso == true) {
			System.out.println("es poderoso");
		} else {
			System.out.println("no es poderoso");
		}
	}

}
