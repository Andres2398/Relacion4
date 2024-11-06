package raiz;

import java.util.Scanner;

public class Raiz1 {

	public static void main(String[] args) {
				
		
		double numero=0;
		double x0=1;
		double x1=0;
	
		System.out.println("introduce un numero");
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextDouble();
		
		while(x1!=x0) {
			x1= (numero/x0)+x0;
			x1=x1/2;
			x0=x1;
		}
		
		
		
		
	}

}
