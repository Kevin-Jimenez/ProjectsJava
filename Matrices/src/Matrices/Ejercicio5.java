/*Crear una matriz marco con 1 y 0*/

package Matrices;

public class Ejercicio5 {
	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 || i==4) {// delimita las columnas 
					matriz[i][j]=1;
				}
				else if(j == 0 || j==4) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		System.out.println("La matriz es");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
