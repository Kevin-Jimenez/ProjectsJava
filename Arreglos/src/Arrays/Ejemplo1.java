/*-------------------Arrays UNidimensionales------------
 * Tipodevariable[] nombre array = new tipodevariable[dimension]*/

package Arrays;

public class Ejemplo1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];// el array se puede llenar como estan en las proximas 3 lineas
		                            // o se puede llenar aca directamente asi: int[] numeros ={7,9,11}
		                         
		numbers[0] = 7;
		numbers[1] = 9;
		numbers[2] = 11;
		
		for(int i = 0; i < 3; i++ ) {
			System.out.println(numbers[i]);
		}
	}

}
