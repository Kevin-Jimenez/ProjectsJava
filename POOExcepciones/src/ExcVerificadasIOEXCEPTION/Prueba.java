package ExcVerificadasIOEXCEPTION;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		//Lectura de archivo .txt
		BufferedReader bf = new BufferedReader(new FileReader("c:\\Prueba\\Texto.txt"));
		String linea;
		while((linea=bf.readLine())!=null) {
			System.out.println(linea);//lee el archivo si por alguna razon se borra el archivo se genera un IOException
		}
		
		
	}
	

}
