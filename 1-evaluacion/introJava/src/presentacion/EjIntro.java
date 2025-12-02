package presentacion;

import java.util.Scanner;

public class EjIntro {

	public static void main(String[] args) {
		// ej1();
		// ej2();
		ej3();
	}

	public static void ej1() {
		int n1 = 10, n2 = 5, n3 = 2;
		System.out.print(n1 + n2 + n3);
	}

	public static void ej2() {
		String saludo = "Hola";
		String nombre = "Sofia";
		System.out.print(saludo + " " + nombre + "!");
	}

	public static void ej3() {
		Scanner sc = new Scanner(System.in);
		int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		String nombre;

		System.out.println("Introduzca las 4 notas del alumno: ");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		nota4 = sc.nextInt();

		System.out.println("Introduzca el nombre del alumno: ");
		nombre = sc.next();

		int promedio = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("El promedio de notas de " + nombre + " es de " + promedio + "");
		sc.close();
	}
}
