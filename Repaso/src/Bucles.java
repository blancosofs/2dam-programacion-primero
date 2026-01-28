import java.util.Scanner;

public class Bucles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// =================================================
		System.out.println("== 13. Piramide a la izquierda == \n");
		System.out.println("Introduzca el valor de N");
		// n es el alto de la piramide
		// int n = sc.nextInt();
		int n = 3;
		for (int filas = 0; filas <= n; filas++) {
			for (int columnas = 1; columnas <= filas; columnas++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// =================================================
		System.out.println("== 14. Piramide doble == \n");
		System.out.println("Introduzca el valor de N");
		// n es el alto de la piramide
		int altura = sc.nextInt();

		for (int filas = 0; filas <= altura; filas++) {
			for (int columnas = 1; columnas <= filas; columnas++) {
				for (int i = altura; i >= 1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			System.out.println();

		}

		// =================================================
		System.out.println("==  Piramide invertida == \n");
		System.out.println("Introduzca el valor de N");
		// n es el alto de la piramide
		//int alturaCreo = sc.nextInt();
		int alturaCreo = 3;
		for (int filas = alturaCreo; filas >= 1; filas--) {
			for (int columnas = 1; columnas <= filas; columnas++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
