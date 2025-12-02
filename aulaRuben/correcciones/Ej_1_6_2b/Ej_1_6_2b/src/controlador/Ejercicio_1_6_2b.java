package controlador;

import java.util.Scanner;

public class Ejercicio_1_6_2b {

	public static void main(String[] args) {
		// DECLARACIONES
		String textoSaludo;
		String nombre;
		Scanner sc = new Scanner(System.in);
		
		// asignamos valores
		System.out.println("Introduce el texto del saludo");
		textoSaludo = sc.nextLine();
		
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		
		
		
		// Imprimimos por pantalla resultados
		System.out.println(textoSaludo + " " + nombre);
		
	}

}
