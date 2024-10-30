package amigos;

import java.util.Scanner;

public class Amigos2 {

	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		System.out.println("Dame el primer numero");
		Scanner sc = new Scanner(System.in);
		numeroA = sc.nextInt();
		System.out.println("Dame el segundo numero");
		numeroB = sc.nextInt();
		
		while(numeroA<1 || numeroB<1) {
			if (numeroA<1) {
				System.out.println("el primer numero debe ser mayor a 0");
				numeroA = sc.nextInt();
			}
			if (numeroB<1) {
				System.out.println("El segundo numero debe ser mayor a 0");
				numeroB= sc.nextInt();
		}
		}	
		int sumaA=0;	
		for (int i = 1; i <= numeroA/2; i++) {
			if(numeroA % i == 0) {
				sumaA+=i;
			}
			
			
			
		}
		int sumaB = 0;
		for (int i = 1; i <= numeroB/2; i++) {
			if(numeroB % i == 0) {
				sumaB+=i;
	
			}
						
		}
		
		if (sumaA == numeroB && sumaB == numeroA) {
			System.out.println("los numeros " + numeroA + " y " + numeroB + " son amigos" );
			
			
		}
		else {
			System.out.println("los numeros " + numeroA + " y " + numeroB + " no son son amigos");
		}
	}



	}


