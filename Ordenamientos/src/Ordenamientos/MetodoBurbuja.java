// Metodo burbuja

package Ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] ,nelementos,aux;
		
		nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
		arreglo = new int[nelementos];
		
		for (int i=0; i<nelementos;i++) {
			System.out.print("Digite elemento "+(i+1)+": ");
			arreglo[i] = entrada.nextInt();
		}
		
		//metodo burbuja
		for(int i=0; i <(nelementos-1);i++) {
			
			for(int j=0;j<(nelementos-1);i++) {
				if(arreglo[j] > arreglo[j+1]) {//si numeroactual > numerosiguiente
					aux= arreglo[j];
					arreglo[j]= arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		System.out.print("Bucle va aca....");
		// mostrar el arreglo ordenado de forma creciente
		System.out.println("\nArreglo creciente");
		for(int i=0; i<nelementos;i++) {
			System.out.print(arreglo[i]+ "-");
		}
		System.out.println("\nArreglo decreciente");
		for(int i =(nelementos);i>=0;i--) {
			System.out.print(arreglo[i]+ "-");
		}
	}
 
}
