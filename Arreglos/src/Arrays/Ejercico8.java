/* crear un programa que cree una tabla de 10 numeros y la dezplace
 * un numero abajo*/

package Arrays;

import java.util.Scanner;

public class Ejercico8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int ultimo;
		
		System.out.println("Llenar arreglo");
		for(int i=0; i <10;i++) {
			System.out.print("Digite el numero "+(i+1)+": ");
			arreglo[i] = entrada.nextInt();
			
		}
		
		ultimo = arreglo[9];// guardamos ultimo aelemento que digito
		for(int i=8;i>=0;i--) {// avanzar la posicion en el arreglo
			arreglo[i+1] = arreglo[i];
		}
		
		arreglo[0] = ultimo; // ponemos ulrimo elemento ocmo 1
		
		System.out.println("El nuevo arreglo es: ");
		for(int i =0;i<=10;i++) {
			System.out.println(i+" Numero: "+arreglo[i]);
		}
	}

}
