package controlador;

public class Calculadora1 {

	public static void main(String[] args) {
		// Declaraciones
		int numero1;
		int numero2;
		int suma;
		int resta;
		int resto;
		int cociente;
		int multiplicacion;
		int media;
		
		
		// Asignamos valores
		numero1 = 100;
		numero2 = 43;
		
		// Hago las operaciones
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		cociente = numero1 / numero2;
		resto = numero1 % numero2;
		media = suma / 2;
		
		// Imprimir resultados
		System.out.println("La suma es: " + suma);
		System.out.println();
		System.out.println("La resta es: ");
		System.out.println(resta);
		System.out.println("La multiplicación es: ("+ multiplicacion +")");
		System.out.println();
		System.out.println("El cociente: es " + cociente + " y el resto es " + resto);
		System.out.println();
		System.out.println("La media es: " + media);
		System.out.println("--------- GRACIAS POR USAR MI CALCULADORA ---------------");

	}

}
