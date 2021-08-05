package ClasesYObjetos;

public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	//Metodos
	public static void main(String[] args) {
		Coche coche1 = new Coche();
		
		coche1.color = "Gris";
		coche1.marca = "Range Rover";
		coche1.km = 100;
		
		Coche coche2 = new Coche();
		
		coche2.color = "Negro";
		coche2.marca = "Ford Fusion";
		coche2.km = 0;
		
		System.out.print("\nEl color del Coche1 es : "+coche1.color);
		System.out.print("\nLa marca del Coche1 es : "+coche1.marca);
		System.out.print("\nEl kilometraje del Coche1 es : "+coche1.km);
		
		System.out.print("\n\nEl color del Coche2 es : "+coche2.color);
		System.out.print("\nLa marca del Coche2 es : "+coche2.marca);
		System.out.print("\nEl kilometraje del Coche2 es : "+coche2.km);
	}

}
