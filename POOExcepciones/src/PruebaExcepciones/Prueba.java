package PruebaExcepciones;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite un numero: ");
		int numero = entrada.nextInt();
		
		System.out.println(numero);
	}//Si se dijita una cadena se produce una excepcion

}
