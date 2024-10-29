package tabla_n_numeros;

import java.util.Scanner;

public class Tabla2 {

	public static void main(String[] args) {
		System.out.println("Dame un numero para saber las tablas de multiplicar desde 1 hasta tu numero");
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		while (numero <= 1) {
			System.out.println("Error, /n Dame un numero mayor a 1");
			numero = sc.nextInt();
		}
			for (int i = 1; i <= numero; i++) {
				System.out.println("Tabla de multiplicar de " + i);
				for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
				}
			}
		}

	}

