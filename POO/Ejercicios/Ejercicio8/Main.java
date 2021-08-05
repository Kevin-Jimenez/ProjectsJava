/*Una empresa de envios tiene varias sucursales en todo el pais, cada sucursal esta definida por su numero de sucursal, direccion y ciudad
 * para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad, sabiendo que se cobra 
 * un dolar por cada kilo, 10 dolares mas si la prioridad es alto y 20 si es express. cada paquete enviado tendra un numero de referencia y el dni de la persona que lo envia*/

package Ejercicio8;

import java.util.Scanner;

public class Main {
	
	public static int buscarSucursal(Sucursal sucursal[],int numeroSucursal,int contadorSucursal) {
		int indice = 0;
		boolean encontrado = false;
		for(int i=0;i<contadorSucursal;i++){
			if(sucursal[i].getNumeroSucursal() == numeroSucursal) {
				encontrado = true;
				indice = i;
			}
		}
		
		if(encontrado == false) {
			indice = -1;
		}
		return indice;
	}
	
	public static int buscarPaquete(Paquete paquete[],int numeroPaquete,int contadorPaquete) {
		int indice = 0;
		boolean encontrado = false;
		for(int i=0;i<contadorPaquete;i++){
			if(paquete[i].getNumeroPaquete() == numeroPaquete) {
				encontrado = true;
				indice = i;
			}
		}
		
		if(encontrado == false) {
			indice = -1;
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contadorSucursal = 0, contadorPaquete = 0,indiceS,indiceP;
		int numeroSucursal,numeroPaquete,prioridad,opcion;
		String direccion,ciudad,dni;
		double peso,precioP;
		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete[] = new Paquete[100];
		
		do {
			System.out.print("\n\n\t\t----- .:MENU:. -----");
			System.out.print("\n\t1. Crear una nueva sucursal");
			System.out.print("\n\t2. Enviar paquete");
			System.out.print("\n\t3. Consultar Sucursal");
			System.out.print("\n\t4. Consultar Paquete");
			System.out.print("\n\t5. Mostrar todas las sucursales");
			System.out.print("\n\t6. Mostrar todos los paquetes");
			System.out.print("\n\t7. Salir");
			System.out.print("\n\t   Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			       case 1:
			    	   System.out.print("\nDigite el numero de sucursal: ");
			    	   numeroSucursal = entrada.nextInt();
			    	   entrada.nextLine();
			    	   System.out.print("\nDigite la direccion: ");
			    	   direccion = entrada.nextLine();
			    	   System.out.print("\nDigite la ciudad: ");
			    	   ciudad = entrada.nextLine();
			    	   sucursal[contadorSucursal] = new Sucursal(numeroSucursal,direccion,ciudad);
			    	   contadorSucursal++;
			    	   break;
			       case 2:
			    	   System.out.print("\nDigite el numero de sucursal que lo va a enviar");
			    	   numeroSucursal = entrada.nextInt();
			    	   indiceS = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
			    	   
			    	   if(indiceS == -1) {
			    		   System.out.print("\nLa sucursal no existe");
			    	   }else {
			    		   System.out.print("\nDigite el numero de paquete: ");
			    		   numeroPaquete = entrada.nextInt();
			    		   entrada.nextLine();
			    		   System.out.print("\nDigite el dni de la persona que envia el paquete: ");
			    		   dni = entrada.nextLine();
			    		   System.out.print("\nPeso del paquete: ");
			    		   peso = entrada.nextDouble();
			    		   System.out.print("\nDigite la prioridad [0: Normal, 1: Alta, 2: Express]: ");
			    		   prioridad = entrada.nextInt();
			    		   paquete[contadorPaquete] = new Paquete(numeroPaquete,dni,peso,prioridad);
			    		   precioP = sucursal[indiceS].calcularPrecio(paquete[contadorPaquete]);
			    		   System.out.print("\nPrecio de envio del paquete: "+precioP);
			    		   contadorPaquete++;   
			    	   }
			    	   			    	   
			    	   break;
			       case 3:
			    	   System.out.print("\nDigite el numero de sucursal: ");
			    	   numeroSucursal = entrada.nextInt();
			    	   indiceS = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
			    	   
			    	   if(indiceS == -1) {
			    		   System.out.print("\nLa sucursal no existe");
			    	   }else {
			    		  System.out.print("\nLos datos de la Sucursal son");
			    		  System.out.print("\n"+sucursal[indiceS].mostrarDatosSucursal());
			    	   }
			    	   break;
			       case 4:
			    	   System.out.print("\nDigite el numero de paquete: ");
			    	   numeroPaquete = entrada.nextInt();
			    	   indiceP = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
			    	   
			    	   if(indiceP == -1) {
			    		   System.out.print("\nEl paquete no existe");
			    	   }else {
			    		  System.out.print("\nLos datos del paquete son");
			    		  System.out.print("\n"+paquete[indiceP].mostrarDatosPaquete());
			    	   }
			    	   break;
			       case 5:
			    	   for(int i=0;i<contadorSucursal;i++) {
			    		   System.out.print("\nLos datos de la sucursal N°"+(i+1)+":");
			    		   System.out.println(sucursal[i].mostrarDatosSucursal());
			    		   System.out.print("\n");
			    	   }
			    	   break;
			       case 6:
			    	   for(int i=0;i<contadorPaquete;i++) {
			    		   System.out.print("\nLos datos del paquete N°"+(i+1)+":");
			    		   System.out.println(paquete[i].mostrarDatosPaquete());
			    		   System.out.print("\n");
			    	   }
			    	   break;
			       case 7:
			    	   break;
			    	   default: System.out.print("\nOpcion de menu Incorrecta");
			}
			System.out.println("\n");
			
		}while(opcion != 7);

	}

}
