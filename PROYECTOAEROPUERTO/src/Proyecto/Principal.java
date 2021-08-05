package Proyecto;

import java.util.Scanner;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4;//numero de aeropuertos
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];
	
	public static void main(String[] args) {
		
		insertarDatosAeropuertos(aeropuertos);
		
		menu();
	}
	public static void insertarDatosAeropuertos(Aeropuerto aero[]) {
		aero[0] = new AeropuertoPublico("Aeropuerto Internacional El Dorado","Bogota","Colombia",80000000);
		aero[0].insertarCompañia(new Compañia("Air Colombia"));
		aero[0].insertarCompañia(new Compañia("Air France"));
		aero[0].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB20","Bogota","Mexico",551.000,380));
		aero[0].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB21","Bogota","Atlanta",1.185000,230));
		aero[0].getCompañia("Air France").insertarVuelo(new Vuelo("FR30","Bogota","Londres",3.000000,180));
		aero[0].getCompañia("Air France").insertarVuelo(new Vuelo("FR31","Bogota","Portugal",3.000000,180));
		aero[0].getCompañia("Air Colombia").getVuelo("IB20").insertarPasajero(new Pasajero("Kevin","20A54","Colombiano"));
		aero[0].getCompañia("Air Colombia").getVuelo("IB21").insertarPasajero(new Pasajero("Santiago","20A64","Colombiano"));
		aero[0].getCompañia("Air France").getVuelo("FR30").insertarPasajero(new Pasajero("Stiven","10A54","Peruano"));
		aero[0].getCompañia("Air France").getVuelo("FR30").insertarPasajero(new Pasajero("Deisy","11A54","Colombiana"));
		aero[0].getCompañia("Air France").getVuelo("FR31").insertarPasajero(new Pasajero("Eduar","10E54","Peruano"));
		aero[0].getCompañia("Air France").getVuelo("FR31").insertarPasajero(new Pasajero("Stiven","10A54","Peruano"));
		
		aero[1] = new AeropuertoPublico("Aeropuerto Internacional Jose Maria Cordova","Medellin","Colombia",80000000);
		aero[1].insertarCompañia(new Compañia("Air Colombia"));
		aero[1].insertarCompañia(new Compañia("Air France"));
		aero[1].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB40","Bogota","Mexico",500000,380));
		aero[1].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB41","Bogota","Atlanta",1500000,230));
		aero[1].getCompañia("Air France").insertarVuelo(new Vuelo("FR50","Bogota","Londres",3000000,180));
		aero[1].getCompañia("Air France").insertarVuelo(new Vuelo("FR51","Bogota","Portugal",1000000,180));
		aero[1].getCompañia("Air Colombia").getVuelo("IB40").insertarPasajero(new Pasajero("Kevin","20A45","Colombiano"));
		aero[1].getCompañia("Air Colombia").getVuelo("IB41").insertarPasajero(new Pasajero("Santiago","20B45","Colombiano"));
		aero[1].getCompañia("Air France").getVuelo("FR51").insertarPasajero(new Pasajero("Stiven","20C45","Peruano"));
		aero[1].getCompañia("Air France").getVuelo("FR51").insertarPasajero(new Pasajero("Deisy","20D45","Colombiana"));
		aero[1].getCompañia("Air Colombia").getVuelo("IB40").insertarPasajero(new Pasajero("Eduar","20E45","Peruano"));
		aero[1].getCompañia("Air France").getVuelo("FR50").insertarPasajero(new Pasajero("Stiven","20F45","Peruano"));
		
		aero[2] = new AeropuertoPublico("Aeropuerto Internacional Rafael Nuñez","Cartagena","Colombia",80000000);
		aero[2].insertarCompañia(new Compañia("Air Colombia"));
		aero[2].insertarCompañia(new Compañia("Air France"));
		aero[2].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB60","Bogota","Mexico",500000,380));
		aero[2].getCompañia("Air Colombia").insertarVuelo(new Vuelo("IB61","Bogota","Atlanta",1500000,230));
		aero[2].getCompañia("Air France").insertarVuelo(new Vuelo("FR70","Bogota","Londres",3000000,180));
		aero[2].getCompañia("Air France").insertarVuelo(new Vuelo("FR71","Bogota","Portugal",1000000,180));
		aero[2].getCompañia("Air Colombia").getVuelo("IB60").insertarPasajero(new Pasajero("Kevin","22A54","Colombiano"));
		aero[2].getCompañia("Air Colombia").getVuelo("IB60").insertarPasajero(new Pasajero("Santiago","20u64","Colombiano"));
		aero[2].getCompañia("Air France").getVuelo("FR70").insertarPasajero(new Pasajero("Stiven","10A54","Peruano"));
		aero[2].getCompañia("Air France").getVuelo("FR70").insertarPasajero(new Pasajero("Deisy","11e54","Colombiana"));
		aero[2].getCompañia("Air Colombia").getVuelo("IB61").insertarPasajero(new Pasajero("Eduar","17E54","Peruano"));
		aero[2].getCompañia("Air France").getVuelo("FR71").insertarPasajero(new Pasajero("Stiven","10i54","Peruano"));
		
		aero[3] = new AeropuertoPrivado("Aeropuerto Internacional Changi","Singapur","Singapur");
		aero[3].insertarCompañia(new Compañia("Air Europa"));
		String empresas[] = {"Boeing","Air Trans"};
		((AeropuertoPrivado)aero[3]).insertarEmpresas(empresas);
		aero[3].getCompañia("Air Europa").insertarVuelo(new Vuelo("FR81","Bogota","Portugal",1000000,180));
		aero[3].getCompañia("Air Europa").getVuelo("FR81").insertarPasajero(new Pasajero("Kevin","23A54","Colombiano"));
	}
	
	public static void menu() {
		int opcion;
		String nombreAero,origen,destino;
		Aeropuerto aeropuerto;
		String nombreCompañia;
		Compañia compañia;
		
		do {
			System.out.println("\t\t.:MENU:.");
			System.out.println("1. Ver Aeropuertos gestionados(Publicos-Privados)");
			System.out.println("2. Ver empresa[Privado] o subvencion[Publico]");
			System.out.println("3. Lista de compañias de un Aeropuerto");
			System.out.println("4. Lista de vuelos por Compañia");
			System.out.println("5. Mostrar todos los posibles vuelos de origen a destino");
			System.out.println("6. Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				mostrarDatosAeropuertos(aeropuertos);
				break;
			case 2:
				mostrarEmpresasSubvencion(aeropuertos);
				break;
			case 3:
				entrada.nextLine();
				System.out.print("Digite el nombre de un Aeropuerto: ");
				nombreAero = entrada.nextLine();
				aeropuerto = buscarAeropuerto(nombreAero, aeropuertos);
				if(aeropuerto == null) {
					System.out.println("El Aeropuerto no existe");
				}else {
					mostrarCompañias(aeropuerto);
				}
				break;
			case 4:
				entrada.nextLine();
				System.out.println("Digite el nombre del Aeropuerto: ");
				nombreAero = entrada.nextLine();
				aeropuerto = buscarAeropuerto(nombreAero, aeropuertos);
				if(aeropuerto == null) {
					System.out.println("El Aeropuerto no existe");
				}else {
					mostrarCompañias(aeropuerto);
					System.out.println("Digite el nombre de la compañia: ");
					nombreCompañia = entrada.nextLine();
					compañia = aeropuerto.getCompañia(nombreCompañia);
					mostrarVuelos(compañia);
				}
				break;
			case 5:
				entrada.nextLine();
				System.out.print("\nDigite la Ciudad de Origen: ");
				origen = entrada.nextLine();
				System.out.print("\nDigite la Ciudad de Destino: ");
				destino = entrada.nextLine();
				mostrarVueloOrigenDestino(origen,destino,aeropuertos);
				break;
			case 6: 
				break;
			default:
				System.out.print("Se equivoco de menu");
			}
		}while(opcion != 6);
	}
	
	public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
		for (int i=0;i<aeropuertos.length;i++){
			if(aeropuertos[i] instanceof AeropuertoPrivado) {// instanceof sirve para identifiacr si pertenece a la clase AeropuertoPrivado
				System.out.println("\tAeropuerto Privado\n");
				System.out.print("Nombre: "+aeropuertos[i].getNombre()+"\n");
				System.out.print("Ciudad: "+aeropuertos[i].getCiudad()+"\n");
				System.out.print("Pais: "+aeropuertos[i].getPais()+"\n");
			}else {
				System.out.println("\tAeropuerto Publico\n");
				System.out.print("Nombre: "+aeropuertos[i].getNombre()+"\n");
				System.out.print("Ciudad: "+aeropuertos[i].getCiudad()+"\n");
				System.out.print("Pais: "+aeropuertos[i].getPais()+"\n");
			}
			System.out.println("\n");
		}
	}
	
	public static void mostrarEmpresasSubvencion(Aeropuerto aeropuertos[]) {
		String empresas[];
		for(int i=0;i<aeropuertos.length;i++) {
			if(aeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
				empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
				for(int j=0;j<empresas.length;j++) {
					System.out.println(empresas[j]);
				}
			}else {
				System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
				System.out.print("Subvencion: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
			}
			System.out.println("");
		}
	}
	
	public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
		boolean encontrado = false;
		int i=0;
		Aeropuerto aero = null;
		while((!encontrado) && (i<aeropuertos.length)) {
			if(nombre.equals(aeropuertos[i].getNombre())) {
				encontrado = true;
				aero = aeropuertos[i];
			}
			i++;
		}
		return aero;
	}
	
	public static void mostrarCompañias(Aeropuerto aeropuerto) {
		System.out.println("\nLas compañias del Aeropuerto "+aeropuerto.getNombre()+" son: ");
		for(int i=0;i<aeropuerto.getNumCompañia();i++) {
			System.out.print("\n"+aeropuerto.getCompañia(i).getNombre()+"\n");
		}
		System.out.println("\n");
	}
	
	public static void mostrarVuelos(Compañia compañia) {
		Vuelo vuelo;
		System.out.println("\nLos vuelos de la Compañia "+compañia.getNombre());
		for(int i=0; i<compañia.getNumVuelo();i++) {
			vuelo = compañia.getVuelo(i);
			System.out.print("\nIdentificador: "+vuelo.getIdentificador());
			System.out.print("\nCiudad Origen: "+vuelo.getCiudadOrigen());
			System.out.print("\nCiudad Destino: "+vuelo.getCoidadDestino());
			System.out.print("\nPrecio: "+vuelo.getPrecio());
			System.out.println("\n");
		}
	}
	
	public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino,Aeropuerto aeropuertos[]) {
		Vuelo vuelo;
		int contador=0;
		Vuelo listaVuelos[];
		for(int i=0;i<aeropuertos.length;i++) {//recorrer aero puertos
			for(int j=0;j<aeropuertos[i].getNumCompañia();j++) {//recorrer compañia
				for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++) {//recorremos los vuelos
					vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
					if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCoidadDestino()))) {
						contador++;
					}
				}
			}
		}
		
		listaVuelos = new Vuelo[contador];
		int q = 0;
		for (int i=0;i<aeropuertos.length;i++) {
			for(int j=0;j<aeropuertos[i].getNumCompañia();j++) {
				for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++) {
					vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
					if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCoidadDestino()))) {
						listaVuelos[q] = vuelo;
						q++;
					}
				}
			}
		}
		return listaVuelos;
	}
	
	public static void mostrarVueloOrigenDestino(String origen, String destino,Aeropuerto aeropuertos[]) {
		Vuelo vuelos[];
		vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
		if(vuelos.length == 0) {
			System.out.print("\nNo existen Vuelos");
		}else {
			System.out.println("Vuelos encontrados \n\n");
			for(int i=0;i<vuelos.length;i++) {
				System.out.print("Identificador: "+vuelos[i].getIdentificador());
				System.out.print("\nCiudad Origen: "+vuelos[i].getCiudadOrigen());
				System.out.print("\nCiudad Destino: "+vuelos[i].getCoidadDestino());
				System.out.print("\nPrecio: "+vuelos[i].getPrecio()+"\n");
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}


    
}
