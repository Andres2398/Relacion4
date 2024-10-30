package abundante;

import java.util.Scanner;

public class Abundante {

	public static void main(String[] args) {
		
		int numero;
		System.out.println("introduce un numero natural");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		while (numero < 1) {
			System.out.println("introduce un numero mayor  a 0");
			numero = sc.nextInt();

		}
		int abundante = 0;
		for (int i = 1; i <= numero/2+1; i++) {
			if (numero % i == 0) {
				abundante += i;

			}
			
		}

		if (abundante > numero) {

			System.out.println(numero + " es abundante");
		} else {
			System.out.println(numero + " no es abundante");
		}

	}

}



