import java.util.Scanner;

/**
 * Escribe en pantalla los múltiplos de 2 por debajo de un TOPE.
 * 
 * @author nacho 18.10.18
 */

public class Multiplo2 {

	public static void main(String argumentos[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el valor tope hasta el que quieres que se muestren multiplos de 2");
		int tope = teclado.nextInt();

		mostrarMultiplos2(tope); // Llama al metodo que hemos creado arriba

		teclado.close();

	}

	public static void mostrarMultiplos2(int tope) {
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int mult; // Almacena el múltiplo calculado
		int cont; // Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0;
		cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope) // Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}

}