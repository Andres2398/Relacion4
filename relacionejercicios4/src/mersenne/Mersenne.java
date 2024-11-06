package mersenne;

import java.util.Scanner;

public class Mersenne {

	public static void main(String[] args) {
		
		int primo = 0;
		boolean esprimo = true;
		int comprobacion = 0;
		System.out.println("Introduce un numero primo");

		Scanner sc = new Scanner(System.in);
		primo = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(primo); i++) {

			if (primo % i == 0) {						
				esprimo = false;						//comprobar si el numero que me dan es primo
			}

		}
		double mersene = 0;
		if (esprimo == true) {
			mersene = Math.pow(2, primo) - 1;			
			for (int i = 2; i <= Math.sqrt(mersene); i++) {	//comprobar si la potencia -1 es primo
				if (mersene % i == 0) {						
					esprimo = false;
				}
			}
		}
		
		if(esprimo==true) {
			System.out.println(primo + " es un numero de mersene");
		}
		else {
			System.out.println(primo + " no es un numero de mersene");
		}
		
		
	}
}


