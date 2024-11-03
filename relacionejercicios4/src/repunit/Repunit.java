package repunit;

import java.util.Scanner;

public class Repunit {

	public static void main(String[] args) {
					
		int numero=0;
		
		System.out.println("introduce un numero");
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		int resto=0;
		boolean repunit = true;
		while(numero>0 && repunit == true) {
			resto=numero%10;
			if (resto!=1) {
				repunit = false;
			}else {
				numero/=10;
			}
			
		}
		if (repunit==true) {
			System.out.println("El numero es repunit");
		}else {
			System.out.println("El numero no es respunit");

	}

}
}
