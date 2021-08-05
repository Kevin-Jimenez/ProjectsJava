/*Una compañia de ventas usados, paga a un personal de ventas 1000 mensuales, mas una comision
 * de 150 por cada carro vendido mas el 5% del valor del carro, hacer un programa que calcule
 * el salario mensual de un vendedor dado*/


package ClaseMath;

import java.util.Scanner;

public class Exercice4Ats {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float salario = 1000, comision=150,cvendidos,vcarro, cventa, total;
		System.out.print("Ingrese el numero de carros vendidos este mes: ");
		cvendidos = entrada.nextFloat();
		System.out.print("Ingrese el valor de la(s) venta: ");

		vcarro= entrada.nextFloat();
		comision *= cvendidos;
		
		cventa = (5 * vcarro) / 100;
		
		total = salario + comision + cventa;
		
		System.out.println("\n Salario de: "+total);
	}

}
