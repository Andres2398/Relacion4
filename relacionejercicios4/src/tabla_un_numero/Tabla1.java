package tabla_un_numero;

import java.util.Iterator;
import java.util.Scanner;

public class Tabla1 {

	public static void main(String[] args) {
		
		System.out.println("Dame un numero para saber su tabla de mutiplicar");
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		while (numero<1){
			System.out.println("Error \nDame un numero mayor a 0");
			numero = sc.nextInt();
			
			
		}
		System.out.println("Tabla de multiplicar de " + numero);
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero + " * " + i +  " = " + numero * i );
		}
			
		}

	}


