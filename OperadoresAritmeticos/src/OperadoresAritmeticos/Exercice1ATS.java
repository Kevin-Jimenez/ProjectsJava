package OperadoresAritmeticos;

import java.util.Scanner;

public class Exercice1ATS {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float number1, number2,sum,res,mul,div,rest ;
		
		System.out.print("Digite 2 numeros: ");
		number1 = entrada.nextFloat();
		number2 = entrada.nextFloat();
		
		sum = number1 + number2;
		res = number1 - number2;
		mul = number1 * number2;
		div = number1 / number2;
		rest = number1 % number2;
		
		System.out.println("Suma: "+sum);
		System.out.println("Resta: "+res);
		System.out.println("Miltiplicacion: "+mul);
		System.out.println("Division : "+div);
		System.out.println("Resto: "+rest);
	}

}
