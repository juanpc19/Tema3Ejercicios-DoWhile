package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		
		String respuesta="";
		
		Scanner dogma = new Scanner(System.in);
		
		int menor=0;
		
		int mayor=101;
		
		do {
			numero = (int)(Math.random()*(mayor-menor)+menor);
			System.out.println("¿Es el número " + numero + "?");
			respuesta = dogma.nextLine();
			
			if(respuesta.equals("MAYOR")) {
				mayor = numero;
			} else if(respuesta.equals("MENOR")) {
				menor = numero;
			}
			
		}while(!respuesta.equals("IGUAL"));
		
		System.out.println("¡¡ENHORABUENA!! Has acertado");

		dogma.close();
		
	}

}
