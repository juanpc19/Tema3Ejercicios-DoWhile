package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero; //Declaro variable en la que guardare el numero con el que el programa
		//intentara adivinar el numero en el que ha pensado el usuario
		
		String respuesta=""; //Declaro variable tipo String, la inicializo vacia y guardo en ella
		//la pista que el usuario da al programa con MAYOR O MENOR
		
		int menor=0;//Declaro variable, la inicializo a 0 para poder usarla en el bucle
		// y guardo en ella el numero mas bajo que quiero permitir usar al programa 
		//para adivinar el numero en el que el usuario ha pensado

		int mayor=101;//Declaro variable, la inicializo a 101 para poder usarla en el bucle
		// y guardo en ella el numero mas alto que quiero permitir usar al programa 
		//para adivinar el numero en el que el usuario ha pensado
		
		//Creo Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Creo el bucle
		do {
			//Creo numero aleatorio y lo asigno a variable numero
			numero = (int)(Math.random()*(mayor-menor)+menor);
			
			//Imprimo valor de variable numero por pantalla
			System.out.println("¿Es el número " + numero + "?");
			
			//Recojo un valor proporcionado por el usuario para variable String respuesta usando el Scanner 
			
			//Si variable respuesta es igual a MAYOR el numero anterior usado por el programa en
			//el print pasara a ser el numero mas alto permitido en el siguiente print en la siguiente iteracion del bucle
			if(respuesta.equals("MAYOR")) {
				mayor = numero;
				
			//Si variable respuesta es igual a MENOR el numero anterior usado por el programa en
			//el print pasara a ser el numero mas bajo permitido en el siguiente print en la siguiente iteracion del bucle
			} else if(respuesta.equals("MENOR")) {
				menor = numero;
			}
			
			//Una vez el programa me diga cual es el numero en el que estaba pensando se lo indico 
			//escribiendo IGUAL cuando me solicite la pista,
			//lo cual hara que deje de cumplirse la condicion que mantiene el bucle en ejecucion
		}while(!respuesta.equals("IGUAL"));
		
		//Imprimo mensaje por pantalla notificando el exito del programa
		System.out.println("¡¡ENHORABUENA!! Has acertado");

		//Cierro Scanner
		dogma.close();
		
	}

}
