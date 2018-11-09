import java.util.Scanner;

public class DibujaCuadrado {

	

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int longitudCuadrado = Integer.parseInt(teclado.nextLine());
	
		System.out.println("Introduce el caracer con el que quieres dibujar el contorno");
		String caracterContorno = teclado.nextLine()+" ";
		
		String cuadrado = muestraCuadrado(caracterContorno, longitudCuadrado) ;
		
		System.out.println(cuadrado);
		
		teclado.close();
	}

	private static String muestraCuadrado(String caracterContorno, int longitud) {
		String cuadrado = "";
		
		// Dibuja la linea de arriba
		for (int i = 0; i < longitud; i++) {
			cuadrado += caracterContorno;
		}
		cuadrado += "\n";

		// Dibuja las lineas de enmedio
		for (int j = 0; j < longitud -2 ; j++) {

			// Dibuja linea izquierda
			cuadrado += caracterContorno;

			// Dibuja los espacios entre lado y lado
			for (int h = 0; h < longitud -caracterContorno.length(); h++) {
				cuadrado += "  ";
			}
			// Dibuja el asterisco del lado derecho y pasa a la linea de abajo
			cuadrado += caracterContorno + "\n";
		}

		// Dibuja la linea de abajo
		if (longitud != 1) {
			for (int k = 0; k < longitud; k++) {
				cuadrado += caracterContorno;
			}
		}

		return cuadrado;
	}

}// class
