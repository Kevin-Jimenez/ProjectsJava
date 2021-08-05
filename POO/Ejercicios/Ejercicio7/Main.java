/*Hacer un programa sencillo para realizar gestiones en un banco para lo cual tendremos dos clase(Cliente- Cuenta)
 * Considerar que un cliente se caracteriza por su nombre, dni, el cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas
 * ademas cada cuenta se caracteriza por un numero de cuenta y saldo*/


package Ejercicio7;

import java.util.Scanner;

public class Main {
	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i=0,indice=0;
		boolean encontrado = false;
		while((i<cuentas.length) && (encontrado==false)) {
			if(cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			if(encontrado == false) {
				indice = -1;
			}
			i++;
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre,apellido,dni;
		int numeroCuenta, nCuentas,opcion,indiceCuenta;
		double saldo,cantidad;
		Cuenta cuentas[];
		Cliente clientes;
		
		System.out.print("\nDigite el nombre del cliente: ");
		nombre = entrada.nextLine();
		System.out.print("\nDigite el apellido del cliente: ");
		apellido = entrada.nextLine();
		System.out.print("\nDigite el dni del cliente: ");
		dni = entrada.nextLine();
		System.out.print("\nCunatas cuentas tiene: ");
		nCuentas = entrada.nextInt();
		
		cuentas = new Cuenta[nCuentas];
		for(int i=0;i<cuentas.length;i++) {
			System.out.print("\n\t\tDigite los datos para la cuenta "+(i+1)+"");
			System.out.print("\nNuemero de cuneta: ");
			numeroCuenta= entrada.nextInt();
			System.out.print("\nSaldo de la cuenta: ");
			saldo = entrada.nextDouble();
			
			cuentas[i] = new Cuenta(numeroCuenta,saldo);
		}
		
		clientes = new Cliente(nombre,apellido,dni,cuentas);
		
		do {
			System.out.println("\n\n\t\t----- .:MENU:. -----");
			System.out.print("\n\t1. Ingresar dinero en la cuenta");
			System.out.print("\n\t2. Retirar dinero de la cuenta");
			System.out.print("\n\t3. Consultar saldo de la cuenta");
			System.out.print("\n\t4. Salir");
			System.out.print("\n\tOpcion: ");
			System.out.print("\n\t-------------------------------");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			       case 1:
			    	   System.out.print("\nDigite el numero de la cuenta: ");
			    	   numeroCuenta = entrada.nextInt();
			    	   indiceCuenta= buscarNumeroCuenta(cuentas,numeroCuenta);
			    	   
			    	   if(indiceCuenta == -1) {
			    		   System.out.print("\nLa cuenta no existe");
			    	   }else {
			    		   System.out.print("\nCuanto dinero desea ingresar: ");
			    		   cantidad = entrada.nextDouble();
			    		   clientes.ingresarDinero(indiceCuenta, cantidad);
			    		   System.out.print("\nLa transaccion ha sido exitosa,\nDinero disponible: "+clientes.consultarSaldo(indiceCuenta));
			    	   }
			    	   break;
			       case 2:
			    	   System.out.print("\nDigite el numero de la cuenta: ");
			    	   numeroCuenta = entrada.nextInt();
			    	   indiceCuenta= buscarNumeroCuenta(cuentas,numeroCuenta);
			    	   
			    	   if(indiceCuenta == -1) {
			    		   System.out.print("\nLa cuenta no existe");
			    	   }else {
			    		   System.out.print("\nCuanto dinero desea retirar: ");
			    		   cantidad = entrada.nextDouble();   
			    		   
			    		   if(cantidad > clientes.consultarSaldo(indiceCuenta)) {
			    			   System.out.print("\nSaldo insuficiente");
			    		   }else {
			    			   clientes.retirarDinero(indiceCuenta, cantidad);
				    		   System.out.print("\nLa transaccion ha sido exitosa,\nDinero disponible: "+clientes.consultarSaldo(indiceCuenta));
			    			   
			    		   }		  
			    	   }
			    	   break;
			       case 3:
			    	   System.out.print("\nDigite el numero de la cuenta: ");
			    	   numeroCuenta = entrada.nextInt();
			    	   indiceCuenta= buscarNumeroCuenta(cuentas,numeroCuenta);
			    	   
			    	   if(indiceCuenta == -1) {
			    		   System.out.print("\nLa cuenta no existe");
			    	   }else {
			    		   System.out.print("\nDinero disponible: "+clientes.consultarSaldo(indiceCuenta));
			    	   }   
			    	   break;
			       case 4:
			    	   break;
			    	   default: System.out.print("Error, se equivoco de menu");
				
			}
			
		}while(opcion != 4);
	}

}
