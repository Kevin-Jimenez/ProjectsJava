/* Diseñar un programa para trabjar con triangulos isoceles para ello defina los atributosnecesarios
 * que se requieren, proporcione metodos de consulta, un metodo contructor e implemente metodos para calcular
 * el perimetro y area de un triangulo, ademas implemenatr un metodo que apartir de un arreglo de triangulos devuelva el area del triangulo de mayor superficie
 * */

package Ejercicio5;

import java.util.Scanner;

public class Main {
	public static double mayorArea(Triangulo triangulos[]) {
		double area;
		
		area = triangulos[0].obtenerArea();
		for(int i=1;i<triangulos.length;i++) {
			if(triangulos[i].obtenerArea() > area) {
				area = triangulos[i].obtenerArea();
			}
		}
		return area;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base,lado;
		int nTrian;
		System.out.print("\nCuantos triangulos vas a usar: ");
		nTrian = entrada.nextInt();
		Triangulo triangulos[] = new Triangulo[nTrian];
		for(int i=0;i<triangulos.length;i++) {
			System.out.println("\nDigite los valores para el triangulo "+(i+1));
			System.out.print("\nDigite la base: ");
			base = entrada.nextDouble();
			System.out.print("\nLado: ");
			lado = entrada.nextDouble();
			
			triangulos[i] = new Triangulo(lado,base);
			
			System.out.print("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
			System.out.print("\nEL area del triangulo es: "+triangulos[i].obtenerArea());
		}
		System.out.print("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
	}

}
