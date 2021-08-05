package ClasesOperadores;

public class Ejercicio6 {
	public static void main(String args[]) {
		
		int ladocuadrado = 9;
		int areacuadrado = (int) Math.pow(ladocuadrado, 2);
		int perimetroc = 4 * ladocuadrado;
		
		System.out.println("\n------------ ¡BIENVENIDO! ------------\n");
		System.out.println("El area del cuadrado es igual a: "+ areacuadrado);
		System.out.println("El perimetro del cuadrado es igual a: "+ perimetroc);
		
		int basetriangulo = 9;
		int alturat = 8;
		int l1t = 8;
		int l2t = 8;
		
		int areatriangulo = (basetriangulo * alturat) / 2;
		int perimetrot = (l1t * 2) + basetriangulo;
		
		System.out.println("El area del triangulo es igual a: "+ areatriangulo);
		System.out.println("El perimetro del triangulo es igual a: "+ perimetrot);
		
		int baser = 8;
		int alturar = 6;
		
		int arear = baser * alturar;
		int perimetror = (2 * baser) + (2 * alturar);
		
		System.out.println("El area del rectangulo es igual a: "+ arear);
		System.out.println("El perimetro del rectangulo es igual a: "+ perimetror);
		
		
		
		
	}

}
