/*Crear una matriz de n x n y decir si es simetrica o no*/

package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizSimetrica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][],filas,col;
		boolean si= true;
		filas= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
		col= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

	    matriz = new int[filas][col];
	    System.out.println("Digite la matriz");
	    for(int i=0;i<filas;i++) {
	    	for(int j=0;j<col;j++) {
	    		System.out.print("Matriz ["+i+"]["+j+"]: ");
	    		matriz[i][j] = entrada.nextInt();
	    	}
	    }
	    
	    if(filas == col) {
	    	int i,j;
	    	i=0;
	    	while(i<filas && si == true) {
	    		j=0;
	    		while(j<i && si == true) {
	    			if(matriz[i][j] != matriz[j][i]) {
	    				si = false;
	    			}
	    			j++;
	    		}
	    		i++;
	    	}
	    	if(si == true) {
	    		JOptionPane.showMessageDialog(null, "La matriz es simetrica");
	    	}else {
	    		JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
	    	}
	    }else {
	    	JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
	    }
	}

}
