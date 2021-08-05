package Ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoPorInsercion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[],nelementos,pos,aux;
		
		nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
		
		arreglo = new int[nelementos];
		
		System.out.println("Digite los elementos del arreglo: ");
		for(int i=0;i<nelementos;i++) {
			System.out.print((i+1)+". Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		// ordenamiento por insercion
		for(int i=0;i<nelementos;i++) {
			pos = i;
			aux = arreglo[i];
			
			while((pos>0) && (arreglo[pos-1] > aux)) {
				arreglo[pos] = arreglo[pos-1];
				pos--;
			}
			arreglo[pos] = aux;
		}
		
		System.out.println("Orden ascentendte: ");
		for(int i=0;i<nelementos;i++) {
			System.out.print(arreglo[i]+"-");
		}
		System.out.print("\nOrden desendente: ");
		for(int i =(nelementos-1); i>=0;i--) {
			System.out.print("\n"+arreglo[i]+"-");
		}
	}

}
