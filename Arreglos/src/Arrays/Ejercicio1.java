// leer 5 numeros guardarlos en un array y mostrarlos en orden de entrada

package Arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[]numbers = new float[5];
		
		System.out.println("Guardando los datos en el arreglo");
		for(int i = 0; i<5;i++) {
			System.out.print((i+1)+". Sigite un numero: ");
			numbers[i] = entrada.nextFloat();
		}
		System.out.println("Imprimir");
		for(float i:numbers) {
			System.out.println(i);
		}
	}

}
