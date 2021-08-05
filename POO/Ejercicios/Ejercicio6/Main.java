/*Construir un programa para trabajar con 2 numeros complejos, implemente el siguiente menu
 * 1 sumar dos numeros complejos
 * 2 miltiplicar 2 numeros complejos
 * 3 comparar 2 numeros complejos (iguales o no)
 * 4 multiplicar un numero complejo por un entero*/

package Ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*numero 1: a + bi
		 * numero2 c +di */
		NumeroComplejos numero1,numero2,suma,mult;
		double a,b,c,d;
		int opcion,num;
		do {
			System.out.print("\n\tOperaciones con numeros complejos");
			System.out.print("\n1. Sumar 2 numeros complejos");
			System.out.print("\n2. Multiplicar 2 numeros complejos");
			System.out.print("\n3. Comparar 2 numeros complejos iguales o no");
			System.out.print("\n4. Multiplicar un numero complejo por uno entero");
			System.out.print("\n5. Salir");
			System.out.print("\nDigite opcion de menu: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			      case 1:
			    	  System.out.print("\n\t--- Digite el primer numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  a = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  b = entrada.nextDouble();
			    	  System.out.print("\n\t--- Digite el segundo numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  c = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  d = entrada.nextDouble();
			    	  
			    	  numero1 = new NumeroComplejos(a,b);
			    	  numero2 = new NumeroComplejos(c,d);
			    	  suma = numero1.calcularSuma(numero2);
			    	  System.out.print("\n\tLa suma es: "+suma.getA()+" + "+suma.getB()+"i");
			    	  break;
			      case 2:
			    	  System.out.print("\n\t--- Digite el primer numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  a = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  b = entrada.nextDouble();
			    	  System.out.print("\n\t--- Digite el segundo numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  c = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  d = entrada.nextDouble();
			    	  
			    	  numero1 = new NumeroComplejos(a,b);
			    	  numero2 = new NumeroComplejos(c,d);
			    	  
			    	  mult = numero1.calcularMultiplicacion(numero2);
			    	  System.out.print("\n\tLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
			    	  
			    	  break;
			      case 3:
			    	  System.out.print("\n\t--- Digite el primer numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  a = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  b = entrada.nextDouble();
			    	  System.out.print("\n\t--- Digite el segundo numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  c = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  d = entrada.nextDouble();
			    	  
			    	  numero1 = new NumeroComplejos(a,b);
			    	  numero2 = new NumeroComplejos(c,d);
			    	  if(numero1.comprobarIgualdad(numero2)) {
			    		  System.out.print("\n\tLos numeros son iguales");
			    	  }else {
			    		  System.out.print("\n\tLos numeros no son iguales");
			    	  }
			    	  break;
			      case 4:
			    	  System.out.print("\n\t--- Digite el primer numero complejo ---");
			    	  System.out.print("\nDigite la parte reaL: ");
			    	  a = entrada.nextDouble();
			    	  System.out.print("\nDigite la parte imaginaria: ");
			    	  b = entrada.nextDouble();
			    	  System.out.print("\nAhora digita el entero: ");
			    	  num = entrada.nextInt();
			    	 
			    	  numero1 = new NumeroComplejos(a,b);
			    	  mult = numero1.multiEntero(num);
			    	  System.out.print("\n\tLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
			}
			System.out.print("\n\n");
			
		}while(opcion != 5);
		

	}

}
