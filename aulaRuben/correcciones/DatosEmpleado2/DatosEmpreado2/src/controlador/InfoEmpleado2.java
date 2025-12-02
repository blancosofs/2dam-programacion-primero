package controlador;

import java.util.Scanner;

public class InfoEmpleado2 {

	public static void main(String[] args) {
	 // DECLARACIONES
		
		// String nombre, apellido1, apellido2, empresa
		String nombre;
		String apellido1;
		String apellido2;
		String nombreEmpresa;
		
		//int edad, sueldoBruto
		int edad;
		int sueldoBruto;

		// Decimales
		double costeHora;
		
		// Carácter
		char equipo;
		
		// Sí/No  Verdadero/Falso
		boolean esSocio;
		
		// Scanner para introducir datos por teclado
		Scanner sc = new Scanner(System.in);

		
	// ASIGNAR VALORES
		// valores de texto ==> entre comillas dobles
		System.out.println("Introduce nombre del empleado");
		nombre = sc.nextLine();
		System.out.println("Introduce Primer apellido");
		apellido1 = sc.nextLine();
		System.out.println("Introduce Segundo apellido");
		apellido2 = sc.nextLine();
		System.out.println("Introduce nombre de la empresa");
		nombreEmpresa = sc.nextLine();
		System.out.println("Introduce edad del empleado");
		edad = sc.nextInt();
		
		
		// Valores double => Cuidado la , separadora de decimal es con punto
		System.out.println("Introduce el coste hora");
		costeHora = sc.nextDouble();
		System.out.println("Introduce el sueldo bruto");
		sueldoBruto = sc.nextInt();
		// valores de texto ==> entre comillas simples
		System.out.println("Introduce la letra identificativa del equipo");
		equipo = sc.next().charAt(0);
		
		// Valores boolean solo dos posibles: true false
		System.out.println("El empleado es socio de la empresa? true/false");
		esSocio = sc.nextBoolean();
		
		sc.close();
		
		// mostrar resultados por pantalla
		System.out.println("**************** FICHA EMPLEADO *************");
		System.out.println("Empresa: " + nombreEmpresa);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido1: " + apellido1 + " -- Apellido2: " + apellido2);
		System.out.println("Edad: " + edad);
		System.out.println("Coste/Hora: " + costeHora);
		System.out.println("Sueldo Bruto: " + sueldoBruto);
		System.out.println("Equipo de Trabajo: " + equipo);
		System.out.println("Es socio de la empresa? " + esSocio);
		System.out.println("************************************************");
		
		
	}

}
