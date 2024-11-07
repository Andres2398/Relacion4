package todos;

import java.math.BigInteger;
import java.util.Scanner;

public class Todos {

	static boolean primo(int numero) {

		boolean esprimo = true;
		int i = 2;
		while (i <= Math.sqrt(numero) && esprimo == true) {
			if (numero % i == 0) {
				esprimo = false;
			}
			i++;

		}
		return esprimo;
	}

	static boolean compuesto(int numero) {
		return !primo(numero);
	}

	static boolean perfecto(int numero) {
		int perfecto = 0;
		for (int i = 1; i <= numero / 2 + 1; i++) {
			if (numero % i == 0) {
				perfecto = perfecto + i;

			}

		}
		boolean esperfecto = true;
		if (perfecto == numero) {
			esperfecto = true;
		} else {
			esperfecto = false;
		}

		return esperfecto;

	}

	static boolean abundante(int numero) {

		int abundante = 0;
		for (int i = 1; i <= numero / 2 + 1; i++) {
			if (numero % i == 0) {
				abundante += i;

			}

		}
		boolean esabundante;
		if (abundante > numero) {

			esabundante = true;

		} else {
			esabundante = false;
		}

		return esabundante;

	}

	static boolean deficiente(int numero) {

		int abundante = 0;
		for (int i = 1; i <= numero / 2 + 1; i++) {
			if (numero % i == 0) {
				abundante += i;

			}

		}
		boolean esdeficiente;
		if (abundante < numero) {

			esdeficiente = true;

		} else {
			esdeficiente = false;
		}

		return esdeficiente;

	}

	static boolean apocaliptico(int numero) {

		BigInteger dos;
		BigInteger diez;
		BigInteger potencia;
		BigInteger division;
		BigInteger resto;
		BigInteger cero;
		BigInteger a;
		BigInteger b;
		BigInteger c;
		BigInteger seis;

		boolean esapocaliptico = false;

		System.out.println("introduce un numero");

		dos = new BigInteger("2");
		diez = new BigInteger("10");
		potencia = dos.pow(numero);

		cero = new BigInteger("0");
		seis = new BigInteger("6");
		b = new BigInteger("0");
		c = new BigInteger("0");
		a = new BigInteger("0");
		while (potencia.compareTo(cero) == 1 && esapocaliptico == false) {

			a = potencia.mod(diez);
			potencia = potencia.divide(diez);
			if (a.compareTo(seis) == 0 && b.compareTo(seis) == 0 && c.compareTo(seis) == 0) {
				esapocaliptico = true;
			}

			b = potencia.mod(diez);
			potencia = potencia.divide(diez);
			if (a.compareTo(seis) == 0 && b.compareTo(seis) == 0 && c.compareTo(seis) == 0) {
				esapocaliptico = true;
			}
			c = potencia.mod(diez);
			potencia = potencia.divide(diez);
			if (a.compareTo(seis) == 0 && b.compareTo(seis) == 0 && c.compareTo(seis) == 0) {

				esapocaliptico = true;

			}

		}
		return esapocaliptico;
	}

	static boolean ambicioso(int numero) {

		boolean seguir = true;

		boolean esambicioso = false;
		int resultado = 0;
		int perfecto = 0;

		for (int i = 1; i <= numero / 2 + 1; i++) {// comprobacion
			if (numero % i == 0) { // perfecto
				resultado += i;
			}
		}

		if (numero == resultado) {
			seguir = false;

		} else {
			int comprobacion = 0;
			while (seguir == true && esambicioso == false) {
				for (int i = 1; i <= resultado / 2; i++) { // sacar los divisores y sumarlos del resultado
					if (resultado % i == 0) {
						perfecto += i;
					}
				}

				if (perfecto == resultado) {
					esambicioso = true;

				} else {
					for (int i = 2; i <= Math.sqrt(perfecto); i++) {//
						if (perfecto % i == 0) { // comprobar si es primo
							comprobacion += i; //
						}

					}
					if (comprobacion == 0) {
						seguir = false;

					} else {
						resultado = perfecto;
						perfecto = 0; // reset de valores
						comprobacion = 0;
					}
				}
			}
		}
		return esambicioso;
	}

	static boolean curioso(int numero) {

		int ultimo = 0;
		int potencia = 0;
		boolean seguir = true;

		potencia = numero * numero;

		ultimo = numero % 10;

		potencia = potencia % 10;

		boolean escurioso;
		if (ultimo == potencia) {

			escurioso = true;

		} else {
			escurioso = false;
		}

		return escurioso;
	}

	static boolean cuadrado(int numero) {

		boolean escuadrado = false;

		for (int i = 1; i <= numero / 2; i++) {

			if (i * i == numero) {
				escuadrado = true;
			}

		}
		return escuadrado;
	}

	static boolean cubo(int numero) {

		boolean escubo = false;
		for (int i = 1; i <= numero / 2; i++) {

			if (i * i * i == numero) {
				escubo = true;
			}

		}

		return escubo;

	}

	static boolean malvado(int numero) {

		int i = 0;
		while (numero >= 2) {

			if (numero % 2 == 1) {
				i++;

			}

			numero /= 2;
		}

		if (numero == 1) {
			i++;
		}
		boolean esmalvado = false;
		if (i % 2 == 0) {
			esmalvado = true;

		} else {
			esmalvado = false;
		}
		return esmalvado;
	}
	
	static boolean feliz(int numero) {
		boolean esfeliz = false;
		boolean seguir = true;
		int resto = 0;
		
		int cociente=0;
		while ( seguir==true && esfeliz==false) {
			cociente=0;
			while(numero>0) {
				resto=numero%10;
				cociente += resto*resto;	//Sacar divisores y sumarlos en  consciente
				numero/=10;
		}
			if(cociente==1) {				// si el consciente es 1 es feliz
				esfeliz = true;
			}
			else if(cociente<10) {			//si consciente menor a 10 el numero no es feliz
				seguir=false;
			}
			numero=cociente;				//reset de valores	
		}
		
		
		
		return esfeliz;
	}
	
	
	static boolean infeliz(int numero) {
		
		
		return !feliz(numero);
	}
	
	public static void main(String[] args) {

		int numero = 0;
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		boolean esprimo = primo(numero);
		System.out.println("el numero es primo ? " + esprimo);

		boolean escompuesto = compuesto(numero);
		System.out.println("el numero es compuesto? " + escompuesto);

		boolean esperfecto = perfecto(numero);
		System.out.println("el numero es perfecto? " + esperfecto);

		boolean esabundate = abundante(numero);
		System.out.println("el numero es abundate? " + esabundate);

		boolean esdeficiente = deficiente(numero);
		System.out.println("el numero es deficiente? " + esdeficiente);

		boolean esapocaliptico = apocaliptico(numero);
		System.out.println("el numero es apocaliptico? " + esapocaliptico);

		boolean esambicioso = ambicioso(numero);
		System.out.println("el numero es ambicioso? " + esambicioso);

		boolean escurioso = curioso(numero);
		System.out.println("el numero es curioso? " + escurioso);

		boolean escuadrado = cuadrado(numero);
		System.out.println("el numero es cuadrado? " + escuadrado);

		boolean escubo = cubo(numero);
		System.out.println("el numero es cubo? " + escubo);

		boolean esmalvado = malvado(numero);
		System.out.println("el numero es malvado? " + esmalvado);

		boolean esfeliz = feliz(numero);
		System.out.println("el numero es feliz? " + esfeliz);
		
		boolean esinfeliz = infeliz(numero);
		System.out.println("el numero es infeliz? "+ esinfeliz);
		

	}

}
