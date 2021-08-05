/*Leer 2 arreglos de 12 elementos enteros y mezclaros en una tercera tabla donde
 * aparezcan de la siguiente manera: 3 de la tabla 1, 3 de la tabla 2, otros 3 de la 1 ,etc*/

package Arrays;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[], b[], c[];
		
		a = new int[12];
		b = new int[12];
		c = new int[24];
		
		System.out.println("---------Digitamos los datos del primer arreglo---------\n");
		for(int i= 0;i<12;i++) {
			System.out.print("Digite el elmento "+(i+1)+": ");
			a[i] = entrada.nextInt();
		}
		System.out.println("---------Digitamos los datos del segundo arreglo---------\n");
		for(int i=0;i<12;i++) {
			System.out.print("Digite el elmento "+(i+1)+": ");
			b[i] = entrada.nextInt();
		}
		
		//recorremos los arreglos e imprimimos el 3 que estar almacenado en J
	   
		int j=0;
		for(int i=0;i<12;i++) {
			c[j] = a[i+i];
			j++;
			c[j] = b[i+i];
			j++;
		}
		System.out.println("El tercer arreglo es: ");
		for(int i=0;i<24;i++) {
			System.out.print(c[i]+ " ");
		}
	}// quedo pendiente
 
}
