/*Leer 10 numeros enteros, guardarlos en un arreglo y mostrarlos de la siguiente manera
 * primer, ultimo, segundo, antepenultimo,etc*/

package Arrays;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numbers[] = new int[10];
		int n =5;// valor para que el arreglo se recorra 5 veces 
		
		System.out.println("----------Ingresar 10 numeros enteros----------\n");
		for(int i = 0; i < 10; i++) {
			System.out.print("     Ingrese el numero "+(i+1)+": ");
			numbers[i] = entrada.nextInt();
		}
		// mostramos el arreglo recoriendolo solo 5 veces
		for(int i = 0; i< n ;i++) {
			System.out.println(numbers[i]);
			System.out.println(numbers[9-i]);
		}
	}

}
