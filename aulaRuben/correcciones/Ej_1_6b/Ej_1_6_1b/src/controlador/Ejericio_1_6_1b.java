package controlador;

import java.util.Scanner;

public class Ejericio_1_6_1b {

	public static void main(String[] args) {
		// Versión valor directamente en variables
		
		// Declaraciones
		int numero1;
		int numero2;
		int numero3;
		int resultado;
		Scanner teclado = new Scanner (System.in); 
		
		// Asignación de valores introducidos por el usuario
		System.out.println("Introduce primer número:");
		numero1 = teclado.nextInt();
		System.out.println("Introduce segundo número:");
		numero2 = teclado.nextInt();
		System.out.println("Introduce tercer número:");
		numero3 = teclado.nextInt();
		
		teclado.close();
		
		
		
		// Calculamos la suma
		resultado = numero1 + numero2 + numero3;
		// Mostramos datos
		System.out.println("El resultado de la suma es: " + resultado);
		

	}

}
