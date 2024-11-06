package feliz;

import java.util.Scanner;

public class feliz {

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
			cociente=0;
			while(numero>0) {
				resto=numero%10;
				cociente += resto*resto;	//Sacar divisores y sumarlos en  consciente
				numero/=10;
		}
			if(cociente==1) {				// si el consciente es 1 es feliz
				feliz = true;
			}
			else if(cociente<10) {			//si consciente menor a 10 el numero no es feliz
				seguir=false;
			}
			numero=cociente;				//reset de valores	
		}
		if(feliz==true) {
			System.out.println("feliz");
		}
		else {
			System.out.println("no es feliz");
		}
		

	}

}
