package Proyecto;

public class AeropuertoPublico extends Aeropuerto{
	private double subvencion;

	
	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] c,double sub) {
		super(nombre, ciudad, pais);
		this.subvencion = sub;
	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}

	public double getSubvencion() {
		return subvencion;
	}
	
}
