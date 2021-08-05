package Proyecto;

public class Vuelo {
	private String identificador;
	private String ciudadOrigen;
	private String coidadDestino;
	private double precio;
	private int numMaxpasajeros;
	private int numActualpasajeros;
	private Pasajero listaPasajeros[];
	
	
	public Vuelo(String identificador, String ciudadOrigen, String coidadDestino, double precio, int numMaxpasajeros) {
		super();
		this.identificador = identificador;
		this.ciudadOrigen = ciudadOrigen;
		this.coidadDestino = coidadDestino;
		this.precio = precio;
		this.numMaxpasajeros = numMaxpasajeros;
		this.numActualpasajeros = 0;
		this.listaPasajeros = new Pasajero[numMaxpasajeros];
	}
	
	public void insertarPasajero(Pasajero pasajero) {
		listaPasajeros[numActualpasajeros] = pasajero;
		numActualpasajeros++;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public String getCoidadDestino() {
		return coidadDestino;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumMaxpasajeros() {
		return numMaxpasajeros;
	}

	public int getNumActualpasajeros() {
		return numActualpasajeros;
	}
	
	public Pasajero getPasajero(int i) {
		return listaPasajeros[i];
	}
	
	public Pasajero getPasajero(String pasaporte) {
		boolean encontrado = false;
		int i=0;
		Pasajero pas=null;
		while((encontrado == false) && (i<listaPasajeros.length)) {
			if(pasaporte.equals(listaPasajeros[i].getPasaporte())) {// es lo mismo que ->pasaporte == listaPasajeros[i].getPasaporte()
				encontrado = true;
				pas = listaPasajeros[i];
			}
			i++;
		}
		
		return pas;
	}

}
