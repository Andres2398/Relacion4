package primo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		int numero;
		System.out.println("introduce un numero para saber si es primo");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		while (numero < 2) {
			System.out.println("tu numero tiene que ser mayor a 1");
			numero = sc.nextInt();

		}
		
		boolean primo = true;
		int i = 2;
		while (i <= Math.sqrt(numero) && primo == true ) {
			if (numero % i == 0) {
				primo = false;

			} else {
				i++;

			}
		}
		if (primo = true) {
			System.out.println(numero + " es primo");
		} else {
			System.out.println(numero + " no es primo");
		}
	}

}
