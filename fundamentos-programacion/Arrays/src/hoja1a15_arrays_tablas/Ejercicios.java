package hoja1a15_arrays_tablas;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;

		do {
			System.out.println();
			System.out.println("# Ejercicios hoja array y tablas#");
			System.out.println("1. Array de enteros");
			System.out.println("2. Array de origen y destino");
			System.out.println("0. Salir");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				int suma = 0;
				int[] vector = new int[15];
				for (int i = 0; i < vector.length; i++) {
					System.out.println("Introduzca 15 numeros aleatorios");
					vector[i] = sc.nextInt();
				}

				for (int i = 0; i < 5; i++) {
					suma += vector[i];
				}

				System.out.println("La suma de los primeros 5 numeros es:" + suma);
				System.out.println("El array es");
				for (int i = 0; i < vector.length; i++) {
					System.out.print(vector[i]);
				}
				break;
			case 2:
				int[] origen = { 10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32 };
				int[] destino = new int[11];
				for (int i = 0; i < origen.length; i++) {
					if (origen[i] > 25) {
						for (int j = 0; j < destino.length; j++) {
							destino[j] = origen[i];
						}
					}
				}
				
				System.out.println("El array origen es:");
				for (int s = 0; s < destino.length; s++) {
					System.out.print(origen[s]+" ");
				}
				System.out.println();
				System.out.println("El array destino es:");
				for (int s = 0; s < destino.length; s++) {
					System.out.print(destino[s]+" ");
				}
				
				break;
			case 3:
				break;

			case 0:
				System.out.println("Saliendo del programa ....");
				break;
			}
		} while (opc != 0);
		sc.close();
	}

}
