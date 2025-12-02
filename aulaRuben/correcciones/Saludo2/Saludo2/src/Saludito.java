
public class Saludito {

	public static void main(String[] args) {
		// declarar variable
		// Sintaxis==> Tipo nombreVariable
		//String textoSaludo, texto1, texto2;
		String textoSaludo;
		String texto1;
		String texto2;
		String textoConcatenado;
		
		
		
		// Asignar valor a variable
		// Sintaxis: nombreVariable = valor
		textoSaludo = "Que tal el recreo";
		texto1="Estamos en Dam";
		texto2=" Y vamos a aprender mucho";
		
		// declarar variable y asignar valor en un paso
		//String textoSaludo = "Que tal el recreo"
		//String texto1 = "Estamos en Dam";
		//String texto2 = " Y vamos a aprender mucho";
		/*
		 System.out.println("hoy es viernes!!!");
		System.out.println(textoSaludo);
		 */
		// print ==> Escribe
		// println ==> Escribe y DESPUÉS salta de línea
		System.out.print("hoy es viernes!!! ");
		System.out.print(textoSaludo);
		System.out.println("siguiente en otra lineaaaa");
		
		System.out.println("hola qué tal " + "como estáis");
		
		System.out.println(texto1 + texto2);
		textoConcatenado = texto1 + texto2 + textoSaludo;
		System.out.println(textoConcatenado);
		
		
		
		
		
		

	}

}
