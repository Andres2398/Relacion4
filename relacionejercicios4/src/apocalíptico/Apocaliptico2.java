package apocalíptico;

import java.math.BigInteger;
import java.util.Scanner;

public class Apocaliptico2 {

	public static void main(String[] args) {
			BigInteger dos;
			BigInteger diez;
			BigInteger potencia;
			BigInteger division;
			BigInteger resto;
			BigInteger cien;
			BigInteger a;
			BigInteger b;
			BigInteger c;
			BigInteger seis;
			
			int numero=0;
			boolean apocaliptico= false;
			
			System.out.println("introduce un numero");
			
			Scanner sc = new Scanner(System.in);
			numero=sc.nextInt();
			
			dos= new BigInteger("2");
			diez= new BigInteger("10");
			potencia = dos.pow(numero);
			division = potencia.divide(diez);
			resto = potencia.mod(diez);
			cien = new BigInteger("100");
			seis= new BigInteger("6");
			 b= new BigInteger("0");
			 c= new BigInteger("0");
			 a= new BigInteger("0");
			while (potencia.compareTo(cien)==1 && apocaliptico == false) {
				
				 a=potencia.mod(diez);
				 potencia=potencia.divide(diez);
				 if (a.compareTo(seis)==0 && b.compareTo(seis)==0
						 && c.compareTo(seis)==0) {
					 apocaliptico=true;
				 }
				
				 b=potencia.mod(diez);
				 potencia=potencia.divide(diez);
				 if (a.compareTo(seis)==0 && b.compareTo(seis)==0
						 && c.compareTo(seis)==0) {
					 apocaliptico=true;
				 }
				 c=potencia.mod(diez);
				 potencia=potencia.divide(diez);
				if (a.compareTo(seis)==0 && b.compareTo(seis)==0
							&& c.compareTo(seis)==0) {
					
					apocaliptico=true;
				
			
				}	
			
			

	}
			
			
			if(apocaliptico==true) {
				
				System.out.println("tu numero es apocaliptico");
				
			
			}
			else {
				System.out.println("tu numero no es apocaliptico");
			}
				
			

}
}
