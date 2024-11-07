package narcisista;

import java.util.Scanner;

public class Narcisista {

	public static void main(String[] args) {
		
		int narcisista = 0;
		System.out.println("intdouce un numero");
		
		Scanner sc = new Scanner(System.in);	
		narcisista = sc.nextInt();
		
		int numero=narcisista;
		int resto = numero%10;
		long comprobar = 0;
		int ndigitos=0;
		int digito=numero;
		
		
		while(digito>0) {  		 //comprobar digitos
			ndigitos++;
			digito/=10;
		}
		digito=numero;
		while (numero>0) {
			digito=numero%10;
			comprobar+= Math.pow(digito, ndigitos); //suma de los digitos y potencias
			numero/=10;
			
			
		}
			if(comprobar==narcisista) {
				System.out.println(narcisista + " es narcisista");
			}
			else {
				System.out.println(narcisista + " no es narcisista");
			}
			
	}

			
}

