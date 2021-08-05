/*Crear una matriz de tamaño n x m y mostrar la suma de cada fila y cada columna*/

package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][],filas,col,sumfilas,sumcol;
		
		filas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de la matriz"));
		col=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de la matriz"));
		
		matriz = new int[filas][col];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Matriz ["+i+"]["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("La matriz original es: ");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		// suma 
		for(int i=0;i<filas;i++) {
			sumfilas =0;
			for(int j=0;j<col;j++) {
				sumfilas += matriz[i][j];
			}
			System.out.print("\nLa suma de la fila "+i+" es: "+sumfilas);
		}
		System.out.print("");
		
		for(int j=0;j<col;j++) {
			sumcol =0;
			for(int i=0;i<filas;i++) {
				sumcol += matriz[i][j];
			}
			System.out.print("\nLa suma de la columna "+j+" es: "+sumcol);
		}
		System.out.print("");
	}

}
