package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		
		int numeroIntroducido=0;/*Declaro la variable, la inicio con valor 0 para usarla en bucle y
		guardare en ella el numero introducido por el usuario*/
		
		int multiplicador=0;/*Declaro la variable, la inicio con valor 0 para usarla en bucle y
		guardare en ella el numero que multiplicara al numero introducido*/
		
		int producto;/*Declaro la variable y guardare en ella el resultado de la multiplicacion
		de numeroIntroducido por multiplicador*/
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el numero del que desea ver la tabla de multiplicar a traves de mensaje por pantalla
		System.out.println("Introduzca el numero del que desea ver la tabla de multiplicar: ");
		
		//Asigno un valor a la variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido=dogma.nextInt();
		
		//Abro bucle
		do {
			
			//incremento el valor de multiplicador en +1 cada vez que se ejecute el bloque
			multiplicador++;
			
			//Asigno valor a variable producto mediante multiplicacion de varibles: numeroIntroducido por multiplicador
			producto=numeroIntroducido*multiplicador;
			
			//Imprimo mensaje por pantalla con la operacion aritmetica escrita y añado el resultado (producto)
			System.out.println(numeroIntroducido + " x " + multiplicador + " = " + producto);
	
		}

		//Establezco la condicion: de que si multiplicador menor a 10, y que mientras se cumpla se seguira ejecutando el bucle
		while (multiplicador<10);
		
		//Cierro Scanner
		dogma.close();
	}

}
