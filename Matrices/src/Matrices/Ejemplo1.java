package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] ,nfilas,ncolumnas;
		
		nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas "));
		ncolumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas "));
		matriz = new int[nfilas][ncolumnas];
		
		for(int i=0;i<nfilas;i++) {
			for(int j=0;j<ncolumnas;j++) {
				System.out.print("Matriz ["+i+"]["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println("\nLa matriz es: ");
		for(int i=0;i<nfilas;i++) {//numero de filas
			for(int j=0;j<ncolumnas;j++) {//numero de columnas
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(""); 
		}
	}

}
