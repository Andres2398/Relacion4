package cuadrado;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		boolean cuadrado=false;
		int numero=0;
		System.out.println("Introduce el numero");
		
		Scanner sc = new Scanner(System.in);
		numero= sc.nextInt();
		
		
		for (int i = 1; i <=Math.sqrt(numero); i++) {
			
			if(i*i==numero) {
				cuadrado=true;
			}
			
			}
		
		if(cuadrado==true) {
			System.out.println("es cuadrado");
		
		}
		else {
			System.out.println("no es cuadrado");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
