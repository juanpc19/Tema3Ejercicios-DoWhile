package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroInicial=0;/*Declaro la variable, la inicio con valor 0 para usarla en bucle y
		guardare en ella el numero incrementado en +1  asumar hasta que adquiera
		el valor del numero introducido por el usuario*/
		
		int numeroIntroducido;//Declaro la variable en la que guardare el numero introducido por el usario 
		
		int sumaTotal=0;/*Declaro la variable, la inicio con valor 0 para usarla en bucle y 
		guardo en ella la suma de todos los numeros anteriores al introducidos por el ususario*/
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el numero al que sumarle todos sus anteriores a traves de mensaje por pantalla
		System.out.print("Introduzca un numero al que quiera sumarle todos sus anteriores: ");
		
		//Asigno un valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Abro el bucle
		do {
			
			//Sumo +1 a variable numeroInicial para adquirir el valor del siguiente numero a sumar
			++numeroInicial;
			//Sumo el valor de variable numeroInicial a sumaTotal
			sumaTotal +=numeroInicial;
		}
		
		/*Establezco la condicion: numeroInicial menor que numeroIntroducido, que mientras se cumpla seguira ejecutando el bucle,
		sumando asi los numeros anteriores al numero introducido por el usuario hasta que el numero a sumar sea mayor
		al numero introducido al usuario, enotonces finalizara el bucle*/
		while (numeroInicial<numeroIntroducido);
		
		/*Imprimo mensaje por pantalla con la variable sumaTotal que contiene el valor de dicha variable al finalizar el bucle,
		dicho valor en ese momento sera igual a el numero introducido mas la suma de todos sus anteriores*/
		System.out.print("La suma de todos los numeros anteriores al numero introducido"
				+ " mas el numero introducido es: " + sumaTotal);
		
		//Cierro Scanner
		dogma.close();

	}

}
