// llenar arreglo

package Arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejemplo2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemntos del arreglo: "));
		
		char[] letras = new char[n];
		
		System.out.println("Digite los elementos del arreglo: ");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+". Digite un caracter");
			letras[i] = entrada.next().charAt(0);
		}
		System.out.println("Los caracteres del arreglo son: ");
		for(int i=0;i<n;i++) {
			System.out.print(letras[i]+ " ");
		}
	}

}
