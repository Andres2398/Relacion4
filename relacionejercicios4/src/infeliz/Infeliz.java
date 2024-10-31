package infeliz;

import java.util.Scanner;

public class Infeliz {

	public static void main(String[] args) {
		boolean feliz = false;
		boolean seguir = true;
		int resto = 0;
		int numero=0;
		int cociente=0;
		
		System.out.println("Introduce un numero");
		

		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		
		while ( seguir==true && feliz==false) {
			while(numero>0) {
				
				resto=numero%10;
				
				cociente += resto*resto;
				
				numero/=10;
		}
			numero=cociente;
			
			if(cociente==1) {
				feliz = true;
			}
			else if(cociente<10) {
				seguir=false;
			}
			cociente=0;
		
			
		}
		if(feliz==false) {
			System.out.println("infeliz");
		}
		else {
			System.out.println("es feliz");
		}
		

	}

}
