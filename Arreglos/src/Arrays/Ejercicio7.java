// leer por teclado una serie de 10 numeros enteros, laaplicacion debe indicarnos 
//si los numeros estan ordenados de manera creciente o decreciente o si estan desordenados
package Arrays;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int arreglo[] = new int[10];
		 boolean creciente=false, decreciente=false;
		 
		 System.out.println("Llenar arreglo");
		 for(int i = 0; i<10;i++) { 
			 System.out.print("Ingresa el numero "+(i+1)+": ");
			 arreglo[i] = sc.nextInt();
		 }
		 
		 for(int i=0; i<=9;i++) {
			 if(arreglo[i]<arreglo[i+1]) {// creciente 1-2-3....
				 creciente = true;
			 }
			 if(arreglo[i]> arreglo[i+1]) {// decreciente 5-4-3....
				 decreciente=true;
			 }
		 }
		 
		 if(creciente==true && decreciente==false) {
			 System.out.println("El arreglo es creciente");
		 }else if(creciente==false && decreciente==true) {
			 System.out.println("El arreglo es decreciente");
		 }else if(creciente == true && decreciente==true) {
			 System.out.println("El arreglo esta desordenado");
		 }else if(creciente == false && decreciente==false) {
			 System.out.println("Todos los numeros son iguales");
		 }
		 
	}

}
