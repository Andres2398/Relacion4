package cubo;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		
		
		boolean cubo=false;
		int numero=0;
		System.out.println("Introduce el numero");
		
		Scanner sc = new Scanner(System.in);
		numero= sc.nextInt();
		
		
		for (int i = 1; i <=Math.sqrt(numero); i++) {
			
			if(i*i*i==numero) {
				cubo=true;
			}
			
			}
		
		if(cubo==true) {
			System.out.println("es cubo");
		
		}
		else {
			System.out.println("no es cubo");
		}
		
		

	}

}
