/*pedir 2 matrices de 5x9 y 9x5 cargar la primera y trasponerla en la segunda*/


package Matrices;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int m1[][] = new int[5][9];
		int m2[][] = new int[9][5];
		
		System.out.println("Digite la matriz ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				System.out.print("Matriz ["+i+"]["+j+"]: ");
				m1[i][j] = entrada.nextInt();
			}
		}
		System.out.println("\nMatriz Original:");
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println("");
		}
		
		//trasponerla
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				m2[i][j] = m1[j][i];				
				
			}
		}
		
		System.out.println("\nLa matriz transpuesta es:");
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(m1[j][i]+" ");
			}
			System.out.println("");
		}
	}
}
