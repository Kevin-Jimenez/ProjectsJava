package ClasesFor;

public class Ejercicio3 {
	public static void main(String args[]) {
		//declaro variables
		int number = 2;
		int sum = 0;
		//en ciclo se inicializa en 1 y se recorre cuanod la variable i sea mayor al numero y hace un incremento
		for(int i = 1; i < number; i ++) {
			// si el modulo(resto) de numero entre i es = 0 se suma 0 + valor de i
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == number) {
			System.out.println(number+ " Es perfecto");
		}
		else {
			System.out.println(number+ " No es perfecto");
		}
		
		/*for(int j = 0; j<10;j++) {
			System.out.println(j);
		}*/
	}

}
