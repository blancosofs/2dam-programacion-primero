package controlador;

import java.util.Scanner;

public class EjemploBufffer {

	public static void main(String[] args) {
		// Ejemplo de la necesidad de limpiar el buffer
		// en determinadas situaciones
		
		// DECLARACIONES
		Scanner sc = new Scanner(System.in);
		int numero;
		String cadenaTexto;
		
		System.out.println("Introduce número entero");
		numero = sc.nextInt();
		
		// Limpiar Buffer
		sc.nextLine();
		
		System.out.println("Introduce una cadena de texto");
		cadenaTexto = sc.nextLine();
		
		System.out.println("El número que has metido es: " + numero);
		System.out.println("La cadena de texto es: " + cadenaTexto);
		
		sc.close();
		

	}

}
