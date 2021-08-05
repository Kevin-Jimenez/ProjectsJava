package ClasesFor;

public class Ejercicio4 {
	public static void main(String args[]) {
		
		int number = 2;
		int sumai = 0;
		
		for(int i = 0; i <= number; i++) {
			sumai = sumai + i;
		}
		System.out.println("Suma de iteraciones: "+ sumai );
		System.out.println("Raiz cuadrada: "+ Math.sqrt(sumai));
		System.out.println("Numero aleatorio: "+ Math.random()*sumai);
		
		System.out.println("Divisores: ");
		
		for(int i = 1; i < sumai; i++) {
			if(number % i == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
		
		int suma = 0;
		 
		for(int i = 1; i< sumai; i++) {
			if(sumai % i == 0) {
				suma = suma + i;
			}
		}
		if(suma == sumai) {
			System.out.println(sumai+ " Es perfecto");
		}else {
			System.out.println(sumai + " No es perfecto");
		}
		int factor = 1;
		for(int i =sumai; i > 0; i--, sumai--) {
			factor = factor * sumai;
		}
		System.out.println("El factor es: "+ factor);
	}

}
