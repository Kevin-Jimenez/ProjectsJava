package ClasesFor;

public class Ejercicio1 {
	public static void main(String args[]) {
		
		int numero = 6;
		int factor = 1;
		// ciclo recorre uno a uno los numeros del 1 a 6 y los multiplica 1*2*3*4*5*6
		for(int i = numero; i > 0; i--, numero --) {
			
			factor = factor * numero;
		}
		System.out.println("El factor es: "+ factor);
	}

}
