import java.util.Scanner;

/**
 * Programa que almacena como cadena de caracter una piramide
 * 
 * @author nacho
 *
 */
public class PiramideAlmacenada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero de lineas de la piramide");
		int numeroLineas = teclado.nextInt();
		String piramide = piramide2(numeroLineas);

		System.out.println(piramide);
 
		teclado.close();
	}

	/**
	 * Devuleve una cadena de caracter de tantas lineas como le indiques
	 * 
	 * @param numLineas
	 * @return
	 */
	public static String piramide2(int numLineas) {

		String piramide = "";
		int numAsteris = 1;
		for (int i = 0; i < numLineas; i++) {
			// Pinta los espacios en la linea antes de los asteriscos
			for (int numEspacios = numLineas; numEspacios > i; numEspacios--) {
				piramide += " ";
			}
			// Pinta los asteriscos en la linea
			for (int f = 0; f < numAsteris; f++) {
				piramide += "*";
			}
			// Se le suma 2 a las variable de los asteriscos y pasa a la siguiente linea
			numAsteris = numAsteris + 2;
			piramide += "\n";
		}
		return piramide;
	}
}
