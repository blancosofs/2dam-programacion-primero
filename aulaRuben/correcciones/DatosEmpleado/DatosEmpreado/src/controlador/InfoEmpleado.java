package controlador;

public class InfoEmpleado {

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
		
	// ASIGNAR VALORES
		// valores de texto ==> entre comillas dobles
		nombre = "Pepito";
		apellido1 = "Grillo";
		apellido2 = "Pérez";
		nombreEmpresa = "Programando S.L";
		edad = 45;
		
		
		// Valores double => Cuidado la , separadora de decimal es con punto
		costeHora = 22.15;
		
		sueldoBruto = 35000;
		// valores de texto ==> entre comillas simples
		equipo = 'D';
		
		// Valores boolean solo dos posibles: true false
		esSocio = true;
		
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
