package EncapsulamientoYMetodosAccesores;

public class Clase2 {
	public static void main(String[] args) {
		Clase1 obj1 = new Clase1();
		
		obj1.setEdad(18);
		obj1.setNombre("Kevin");
		
		System.out.print("\nNombre: "+obj1.getNombre());
		System.out.print("\nEdad: "+obj1.getEdad());
	}

}
