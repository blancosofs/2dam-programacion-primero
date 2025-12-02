package controlador;

public class Principal {

	public static void main(String[] args) {
		int x;
		int y;
		int variableIntermedia;
		
		x = 100;
		y= 200;
		
		System.out.println("Valor inicial de x: " + x);
		System.out.println("Valor inicial de y: " + y);
		
		variableIntermedia = y;
		y = x;
		x =  variableIntermedia;
		
		
		System.out.println("*************************");
		System.out.println("Valor final de x: " + x);
		System.out.println("Valor final de y: " + y);
		

	}

}
