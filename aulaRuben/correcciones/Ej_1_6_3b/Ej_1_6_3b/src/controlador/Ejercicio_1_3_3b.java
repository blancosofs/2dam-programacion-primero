package controlador;

import java.util.Scanner;

public class Ejercicio_1_3_3b {

	public static void main(String[] args) {
		
		/*
		double nota1 = 5.0;
		double nota2 = 7.5;
		double nota3 = 8.25;
		double nota4 = 9.0;
		*/
		// DECLARACIONES
		double nota1 = 5.0;
		double nota2 = 7.5;
		double nota3 = 8.25;
		double nota4 = 9.0;
		double promedio;
		String nombre;
		Scanner sc = new Scanner(System.in);
		
		
		//ASIGNACIONES
		
		System.out.println("Dime la primera nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Dime la segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Dime la tercera nota: ");
		nota3 = sc.nextDouble();
		
		System.out.println("Dime la cuarta nota: ");
		nota4 = sc.nextDouble();
		
		// Limpiamos buffer
		sc.nextLine();
		
		System.out.println("Dime el nombre: ");
		nombre = sc.nextLine();
		
		// CALCULAMOS PROMEDIO
		promedio = (nota1 + nota2 + nota3 + nota4)/4;
		
		// MOSTRAR RESULTADOS
		System.out.println("El promedio de notas de " + nombre + " es de " + promedio);
		
		

	}

}
