// pedir 5 numeros guardarlos en un array y mostrarlos de orden inverso al introducido

package Arrays;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numbers[] = new float[5];
		int n=5;
		
		for(int i=0; i < 5;i++) {
			System.out.print((i+1)+". Digite el siguiente numero: ");
			numbers[i] = entrada.nextFloat();
		}
		for(int i =0; i < n;i++) {
			System.out.println(numbers[n - i -1]);
		}
	}

}
