import java.util.Scanner;

/**
 * Escribe en pantalla los múltiplos de 2 por debajo de un TOPE.
 * 
 * @author nacho 18.10.18
 */

public class Multiplo4 {
	public static void main(String argumentos[]) {

		mostrarMultiplos2(pedirTope());
	}

	private static void mostrarMultiplos2(int tope) {
		int mult; // Almacena el múltiplo calculado
		int cont; // Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");

		// Bucle de calculo de visualizacion
		while (mult < tope) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
	}

	private static int pedirTope() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el valor tope hasta el que quieres que se muestren multiplos de 2");
		int valor = teclado.nextInt();
		
		teclado.close();
		return valor;
	}
}