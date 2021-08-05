/*Leer 5 numeros por teclado almacenarlos en arrglo acontinuacion realizar la media de
 * numeros positivos y negativos y sacar conteo de 0*/

package Arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numbers[] = new float[5];
		float sumap=0,suman=0,mediap,median;
		int countp=0,countn=0,count0=0;
		
		System.out.println("Digitando numeros");
		for(int i = 0; i<5;i++) {
			System.out.print((i+1)+" Digite numero: ");
			numbers[i] = entrada.nextFloat();
			if(numbers[i] == 0) {
				count0++;
			}else if(numbers[i] > 0) {
				sumap += numbers[i];
				countp++;
			}else {
				suman += numbers[i];
				countn++;
			}
		}
		 
		// media positivos
		if(countp == 0) {
			System.out.println("NO se puede sacar la media de positivos");
		}else {
			mediap = sumap / countp;
			System.out.println("La media de positivos es: "+mediap);
		}
		
		// media negativos
		if(countn == 0) {
			System.out.println("No se puede sacar la media de negativos");
		}else {
			median = suman / countn;
			System.out.println("La media de negativos es: "+median);
		}
		System.out.println("La cantidad de ceros es de: "+count0);
		
	}

}
