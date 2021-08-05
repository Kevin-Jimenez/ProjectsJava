/*Ejercicio3: Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio
 * imprima las propiedades del vehiculo mas barato. para ello, se deberan leer por teclado las caracteristicas de cada vehiculo
 * y crear una clase que represente a cada uno de ellos*/

package Ejercicio3;
import java.util.Scanner;

public class Main {
	
	public static int indiceBarato(Vehiculo coches[]) {
		float precio;
		int indice=0;
		
		precio = coches[0].getPrecio();
		for(int i=1;i<coches.length;i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numVeh,indicecochebarato;
		System.out.print("\nCuantos vehiculos desea ingresar: ");
		numVeh = entrada.nextInt();
		
		Vehiculo coches[] = new Vehiculo[numVeh];
		
		for(int i=0;i<numVeh;i++) {
			entrada.nextLine();
			System.out.print("\n\t\tDigite las caracteristicas del Vehiculo "+(i+1));
			System.out.print("\n\nDigite la marca del Vehiculo: ");
			marca = entrada.nextLine();
			System.out.print("\nDigite el modelo del Vehiculo: ");
			modelo = entrada.nextLine();
			System.out.print("\nDigite el precio del Vehiculo: ");
			precio = entrada.nextFloat();
			coches[i] = new Vehiculo(marca,modelo,precio);
		}
		indicecochebarato = indiceBarato(coches);
		System.out.println("\n\n\t\t--- El coche mas barato es --- ");
		System.out.println("\n"+coches[indicecochebarato].mostrarDatos());
		
	}

	

}
