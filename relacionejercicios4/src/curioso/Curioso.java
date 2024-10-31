package curioso;


import java.util.Scanner;

public class Curioso {

	public static void main(String[] args) {
		int numero = 0;
		int ultimo = 0;
		int potencia = 0;
		boolean seguir = true;
		System.out.println("Introduce un numero");

		Scanner sc = new Scanner(System.in);

		numero = sc.nextInt();

		potencia = numero * numero;

		ultimo = numero%10;
		
		potencia=potencia%10;
		
		if(ultimo==potencia) {
			System.out.println("es curioso");
			
			
		}
		else {
			System.out.println("no es curioso");
		}
		
		
	}
}

		
