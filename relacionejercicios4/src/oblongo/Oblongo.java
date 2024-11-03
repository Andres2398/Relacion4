package oblongo;

import java.util.Scanner;

public class Oblongo {

	public static void main(String[] args) {
		
		int numero=0;
		
		System.out.println("introduce un numero");
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		int a=0;
		int b=1;
		boolean oblongo =false;
		while(a<=Math.sqrt(numero) && oblongo == false) {
			if (a*b==numero) {
				oblongo=true;
				
			}
			else {
				a++;
				b++;
			}
			
		}
		
		if (oblongo==true) {
			System.out.println("El numero es oblongo");
		}else {
			System.out.println("El numero no es oblongo");
		}
		
		
		
	}

}
