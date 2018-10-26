import java.util.Scanner;

/**
 * Programa que dibuja una piramide de tantas filas como le digas
 * 
 * @author nacho 18.10.19
 */
public class DibujaPiramide {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("De cuantas filas quieres la primide?");
		int num = teclado.nextInt();
		piramide(num);

		teclado.close();
	}

	/**
	 * Metodo para dibujar una piramide
	 * 
	 * @param num la piramide tendra las filas que se le digan en el parametro
	 */
	public static void piramide(int numLineas) {

		int numAsteris = 1;
		for (int i = 0; i < numLineas; i++) {
			// Pinta los espacios en la linea antes de los asteriscos
			for (int numEspacios = numLineas; numEspacios > i; numEspacios--) {
				System.out.print(" ");
			}
			// Pinta los asteriscos en la linea
			for (int f = 0; f < numAsteris; f++) {
				System.out.print("*");
			}
			// Se le suma 2 a las variable de los asteriscos y pasa a la siguiente linea
			numAsteris = numAsteris + 2;
			System.out.print("\n");
		}
	}
}
