/*Hacer un programa para calcular el area de poligonos(Triangulos y Rectangulos) el programa debe ser capaz de almacenar
 * en un arreglo N triangulos y rectangulos, y al final mostrar el area y los datos de cada uno. para ello se tendra lo siguiente
 * 
 * 1. Una super clase llamada Poligono
 * 2. Una sub clase llamada Rectangulo
 * 3. Una Sub clase llamada Triangulo*/

package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		llenarPoligono();
		mostrarDatos();
	}
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.print("\nDigite que poligono desea");
				System.out.print("\n1. Triangulo");
				System.out.print("\n2. Rectangulo");
				System.out.print("\nOpcion: ");
				opcion = entrada.nextInt();
			}while(opcion < 1 || opcion > 2);
		
			switch(opcion) {
			       case 1:
			    	   llenarTriangulo();
				       break;
			       case 2:
			    	   llenarrectangulo();
			    	   break;
			}
			System.out.print("\nDesea introducir otro poligono, S o N: ");
     		respuesta = entrada.next().charAt(0);
		}while(respuesta == 's' || respuesta == 'S');
	}

	public static void llenarTriangulo() {
		double lado1,lado2,lado3;
		System.out.print("\nDigite el lado1: ");
		lado1 = entrada.nextDouble();
		System.out.print("\nDigite el lado2: ");
		lado2 = entrada.nextDouble();
		System.out.print("\nDigite el lado3: ");
		lado3 = entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
		poligono.add(triangulo);
	}
	
	public static void llenarrectangulo() {
		double lado1,lado2;
		System.out.print("\nDigite el lado1: ");
		lado1 = entrada.nextDouble();
		System.out.print("\nDigite el lado2: ");
		lado2 = entrada.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1,lado2);
		poligono.add(rectangulo);
	}
	
	public static void mostrarDatos() {
		for(Poligono poli: poligono) {
			System.out.print("\n"+poli.toString());
			System.out.print("\nEl area es: "+poli.area());
		}
	}

}
