/* Crear y cragar 2 matrices de 3x3 sumarlas y mostrar su suma*/

package Matrices;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int matriz2[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int suma[][] = new int[matriz1.length][matriz2.length];
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz2.length;j++) {
				suma[i][j] =matriz1[i][j]+matriz2[i][j];
			}
		}
		System.out.println("La suma de la matriz es: ");
		System.out.print(suma);
		
		
	}

}
