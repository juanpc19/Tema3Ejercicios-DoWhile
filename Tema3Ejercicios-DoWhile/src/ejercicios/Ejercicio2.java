package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num=0; /*Declaro la variable num y la inicializo para usarla en el bucle,
		guardo en ella el valor a imprimir por pantalla cada vez que se ejecute el bucle*/
		
		//Abro bucle
		do {
			
			//Hago que se le sume +2 cada vez que se ejecute el bloque de instrucciones
			num+=2;
			/*Hago que tambien se imprima un mensaje por pantalla con el nuevo valor
			de variable num cada vez que se ejecute el bloque*/
			System.out.println(num);
		}
		
		/*Establezo la condicion: numero menor a 200, que mientras se cumpla
		se volvera a ejecutar el bucle*/
		while (num<200);
		

	}

}
