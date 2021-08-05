/*Llenar un arreglo 10 posiciones, y buscar uno en la tablam ostrar en que posicion 
 * se encuentra*/

package Arrays;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int numero;
		boolean creciente = true;
		
		do {// pedimos arreglo
			for(int i=0; i<10;i++) {
				System.out.print("Digite un numero "+(i+1)+": ");
				arreglo[i] = entrada.nextInt();
			}
			// verificar si el arreglo esta ordenado
			for(int i=0; i<9;i++) {
				if(arreglo[i] < arreglo[i+1]) {// creciente
					creciente=true;
				}
				if(arreglo[i] > arreglo[i+1]) {// decrecientwe
					creciente = false;
					break;
				}
			}
			
			if(creciente == false) {
				System.out.println("\n El arreglo esta desordenado, digite nuevamente");
			}
			
		}while(creciente == false);
		
		// pedimos el numero a buscar
		System.out.print("\nDigite el numero a buscar: ");
		numero = entrada.nextInt();
		
		// Byscamos numero
		int i=0;
		while(i<10 && arreglo[i]<numero) {// recorre el arreglo hasta encontrar el numero
			i++;
		}
		if(i==10) {// se recorrio el arreglo y no encontro nada
			System.out.println("Numero no encontrado");
		}else {
			if(arreglo[i] == numero) {
				System.out.println("Numero encontrado en la posicion: "+i);
			}else {
				System.out.println("Numero no encontrado");
			}
		}
	}

}
