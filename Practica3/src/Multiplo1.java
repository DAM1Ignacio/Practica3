
/**
 * Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.
 * 
 * @author nacho 18.10.18
 */

public class Multiplo1 {

	public static void main(String argumentos[]) {

		mostrarMultiplos1(); // Llama al metodo que hemos creado abajo

	}

	public static void mostrarMultiplos1() {
		// Declaración de variables
		final int TOPE = 16; // Constante, el máximo valor del multiple
		int mult; // Almacena el múltiplo calculado
		int cont; // Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");

		// Bucle de cálculo y visualización
		while (mult < TOPE) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
	}
}