package compuesto;

import java.util.Scanner;

public class Compuesto {

	public static void main(String[] args) {
		int numero;
		System.out.println("introduce un numero para saber si es compuesto");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		while (numero < 1) {
			System.out.println("tu numero tiene que ser mayor a 0");
			numero = sc.nextInt();

		}

		boolean compuesto = false;
		int i = 2;
		while (i <= numero / 2 && compuesto == false) {
			if (numero % i == 0) {

				compuesto = true;

			} else {
				i++;

			}
		}
		if (compuesto == true) {
			System.out.println(numero + " es compuesto");
		} else {
			System.out.println(numero + " no es compuesto");
		}
	}

}

