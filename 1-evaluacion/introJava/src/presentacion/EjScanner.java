package presentacion;

import java.util.Scanner;

public class EjScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ej1(sc);
		ej2(sc);
	}

	public static void ej1(Scanner sc) {
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.next();
		System.out.println("Introduzca su apellido: ");
		String apellido = sc.next();
		
		System.out.println("hola "+nombre+" "+apellido);
	}

	public static void ej2(Scanner sc) {
		int n1, n2, n3;

		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca un numero: ");
		n2 = sc.nextInt();
		System.out.println("Introduzca un numero: ");
		n3 = sc.nextInt();
		System.out.println("Suma de los numeros: "+(n1+n2+n3));
	}

}
