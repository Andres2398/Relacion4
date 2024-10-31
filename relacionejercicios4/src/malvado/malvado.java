package malvado;

import java.util.Scanner;

public class malvado {

	public static void main(String[] args) {
		
		int numero = 0;

		System.out.println("introduce un numero");

		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		int i = 0;
		while (numero >= 2) {

			if (numero % 2 == 1) {
				i++;

			}

			numero /= 2;
		}

		if (numero == 1) {
			i++;
		}

		if (i % 2 == 0) {
			System.out.println("es malvado");

		} else {
			System.out.println("no es malvado");
		}
	}

}
