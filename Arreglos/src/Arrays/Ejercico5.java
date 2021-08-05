// leer 2 arreglos de 10 numeros y mezclaros en un tercer arreglo

package Arrays;

import java.util.Scanner;

public class Ejercico5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[20];
		System.out.println("-----------Llenando primer arreglo----------\n");
		for(int i = 0 ; i < 10; i++) {// llenamos el primer arreglo
			System.out.print("     Digite el numero "+(i+1)+": ");
			A[i] = entrada.nextInt();
		}
		System.out.println("-----------Llenando segundo arreglo----------\n");
		for (int i = 0; i< 10;i++) {// llenamos el segundo arreglo
			System.out.print("     Digite el numero "+(i+1)+": ");
			B[i] = entrada.nextInt();
		}
		
		// mezclar los dos arreglos utilizando iterado i para A y B y j para C
		int j=0;
		for(int i=0;i<10;i++) {
			C[j] = A[i];// 1A, 2A
			j++;
			C[j] = B[i];// 1B, 2B
			j++;
		}
		System.out.println("El tercer arreglo es: ");
		for(int i=0;i<20;i++) {
			System.out.print(C[i]+ " ");
		}
		
	}

}
