package controlador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir radio al usuario
		// Mostrar el área de la circunferencia y su longitud
		// NOTA: Consideramos Pi como una constante
		
		// Declaraciones
		// double Pi, radio, longitud, area;
		final double PI = 3.1416;
		double radio;
		double longitud;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		
		longitud = 2 * PI * radio;
		area = PI * radio * radio;
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		
		System.out.println("Él área de la circunferencia es: " + area);
		
		sc.close();

	}

}







