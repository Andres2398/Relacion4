package todos;

import java.util.Scanner;

public class Todos {
	
	static boolean primo(int numero) {
		
		boolean primo = true;
		int i = 2;
		while (i <= Math.sqrt(numero) && primo == true ) {
			if (numero % i == 0) {
				primo = false;

			
				

			}
			i++;	
		}
		
		return primo;
		
	}
	public static void main(String[] args) {
		
		int numero=0;
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		boolean primo = primo(numero); 	
		
		System.out.println("el numero es primo ? " + primo);
		
		
		
		
		
		
	}

	
	}


