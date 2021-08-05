package MiembrosEstaticosDeUnaClase;

public class Estaticos {
	private static String frase = "primera Frase";
	
	public static void main(String[] args) {
		Estaticos ob1 = new Estaticos();
		Estaticos ob2 = new Estaticos();
		
		ob2.frase = "Segunda Frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		//Aparecen en ambos "Segunda frase" por ser un atributo statico, le pertenece a la clase
		// el ultimo cambio queda en todos
	}

}
