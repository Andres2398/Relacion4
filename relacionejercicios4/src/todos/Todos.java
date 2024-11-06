package todos;

import java.util.Scanner;

public class Todos {

	static boolean primo(int numero) {

		boolean primo = true;
		int i = 2;
		while (i <= Math.sqrt(numero) && primo == true) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}
	
	static boolean compuesto(int numero) {	
		return !primo(numero);
	}
	static boolean perfecto(int numero) {
		int perfecto = 0;
		for (int i = 1; i <= numero/2+1; i++) {
			if (numero % i == 0) {
				perfecto = perfecto +  i;

			}
			
		}
		boolean esperfecto=true;
		if (perfecto == numero) {
			esperfecto=true;
		}else {
			esperfecto=false;
		}
		

		return esperfecto;
		
	}

	public static void main(String[] args) {

		int numero = 0;
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		boolean primo = primo(numero);

		System.out.println("el numero es primo ? " + primo);
		
		boolean compuesto=compuesto(numero);
		System.out.println("el numero es compuesto? " + compuesto);
		
		boolean esperfecto= perfecto(numero);
		System.out.println("el numero es perfecto? " + esperfecto);

	}

}
