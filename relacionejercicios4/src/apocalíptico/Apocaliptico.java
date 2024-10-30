package apocalíptico;

import java.util.Scanner;

public class Apocaliptico {

	public static void main(String[] args) {
		boolean apocaliptico = false;
		System.out.println("intoduce un numero");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();

		numero = Math.pow(2, numero);

		double a = 0;
		double b = 0;
		double c = 0;
		a = numero % 10;
		numero /= 10;

		while (numero > 100 && apocaliptico == false) {

			b = numero % 10;
			if (a >= 6.0 && a < 7.0 && b >= 6.0 && b < 7.0 && c >= 6.0 && c < 7.0) {
				apocaliptico = true;
			}

			numero /= 10;
			c = numero % 10;
			if (a >= 6.0 && a < 7.0 && b >= 6.0 && b < 7.0 && c >= 6.0 && c < 7.0) {
				apocaliptico = true;

			}
			numero /= 10;
			a = numero % 10;
			if (a >= 6.0 && a < 7.0 && b >= 6.0 && b < 7.0 && c >= 6.0 && c < 7.0) {
				apocaliptico = true;

			}
			numero /= 10;
		}

		if (apocaliptico == true) {
			System.out.println("es apocaliptico");
		} else {
			System.out.println("no es apocaliptico");
		}

	}

}
