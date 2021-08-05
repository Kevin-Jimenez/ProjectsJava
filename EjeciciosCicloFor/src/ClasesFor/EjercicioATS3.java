package ClasesFor;

import java.util.Scanner;

public class EjercicioATS3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,sum=0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Introduzca un numero: ");
			n = entrada.nextInt();
			sum += n;
		}
		System.out.println("La suma es: "+sum);
		 
	}

}
