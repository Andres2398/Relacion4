package ambicioso;


import java.util.Scanner;

public class Ambicioso {

	public static void main(String[] args) {
		
		int numero = 0;
		boolean seguir = true;
		boolean ambicioso = false;
		int resultado = 0;
		int perfecto = 0;
		System.out.println("introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		while (seguir == true && ambicioso == false) {
			for (int i = 2; i <= numero; i++) {

				if (numero % i == 0) {
					resultado += i;
				}

			}
			if (resultado == 0) {
				seguir = false;
			}

			

			

			for (int i = 2; i <= resultado; i++) {

				if (resultado % i == 0) {
					perfecto += i;

				}

			}
			if (perfecto == 0) {
				seguir = false;
			}

			if (perfecto == resultado) {
				ambicioso = true;
			} else {
				resultado = perfecto;
				perfecto = 0;
			}

		}

		if (ambicioso == true) {
			System.out.println(" es ambicioso ");

		} else {
			System.out.println("no es ambicioso");
		}

	}

}
		

	


