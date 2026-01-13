package programacionModularejercicio1;

import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero (int)");
		int numero = sc.nextInt();
		OperacionesVarias.comprobarNumero(numero);
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Introduzca la altura de la piramide");
		int altura = sc.nextInt();
		System.out.println("Introduzca los caracteres de la piramide");
		String caracteres = sc.nextLine();
		OperacionesVarias.piramidePersonal(altura, caracteres);
		sc.close();
	}

}
