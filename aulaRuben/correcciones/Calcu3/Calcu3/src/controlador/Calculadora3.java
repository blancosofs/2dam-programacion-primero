package controlador;

import java.util.Scanner;

public class Calculadora3 {

	public static void main(String[] args) {
		// Declaraciones
		int numero1;
		int numero2;
		int resultado;
		
		// para recoger datos introducidos por el usuario
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce primer número: ");
		
		// Asignamos valores
		numero1 = sc.nextInt();
		
		System.out.println("Introduce segundo número: ");
		numero2 = sc.nextInt();
		
		sc.close();
		
		// Hago la suma
		resultado = numero1 + numero2;
		// imprimo la suma
		System.out.println("La suma es: " + resultado);
		// Hago la resta
		resultado = numero1 - numero2;
		// imprimo la resta
		System.out.println();
		System.out.println("La resta es: ");
		System.out.println(resultado);
		// hago la multiplicación
		resultado = numero1 * numero2;
		// imprimo multiplicación
		System.out.println("La multiplicación es: ("+ resultado +")");
		// Hago cociente
		resultado = numero1 / numero2;
		// imprimo cociente
		System.out.println();
		System.out.print("El cociente: es " + resultado);
		// Hago resto
		resultado= numero1 % numero2;
		// imprimo resto
		System.out.println(" y el resto es " + resultado);
		
		// hago la media
		resultado = (numero1 + numero2) / 2;
		// Imprimo la media 
		System.out.println();
		System.out.println("La media es: " + resultado);
		
		// Imprimo mensaje final
		System.out.println("--------- GRACIAS POR USAR MI CALCULADORA ---------------");
	
		
		
	
		

	}

}
