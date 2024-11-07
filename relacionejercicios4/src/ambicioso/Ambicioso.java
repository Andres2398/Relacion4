package ambicioso;

import java.util.Scanner;

public class Ambicioso {

	public static void main(String[] args) {
		boolean seguir = true;
		int numero = 0;
		boolean ambicioso = false;
		int resultado = 0;
		int perfecto = 0;
		System.out.println("introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		for (int i = 1; i <= numero / 2 + 1; i++) {// comprobacion
			if (numero % i == 0) { // perfecto
				resultado += i;
			}
		}

		if (numero == resultado) {
			seguir = false;

		} else {
			int comprobacion = 0;
			while (seguir == true && ambicioso == false) {
				for (int i = 1; i <= resultado / 2; i++) { // sacar los divisores y sumarlos del resultado
					if (resultado % i == 0) {
						perfecto += i;
					}
				}

				if (perfecto == resultado) {
					ambicioso = true;

				} else {
					for (int i = 2; i <= Math.sqrt(perfecto); i++) {//
						if (perfecto % i == 0) {				 // comprobar si es primo
							comprobacion += i;					 //
						}

					}
					if (comprobacion == 0) {
						seguir = false;

					} else {
						resultado = perfecto;
						perfecto = 0; // reset de valores
						comprobacion = 0;
					}
				}
			}
		}

		if (ambicioso == true) {
			System.out.println("es ambicioso");
		} else {
			System.out.println("no es ambicioso");
		}

	}

}
