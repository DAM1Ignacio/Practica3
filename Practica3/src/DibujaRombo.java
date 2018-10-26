import java.util.Scanner;

public class DibujaRombo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿De cuantas lineas quieres el rombo?");
		int numLineas = teclado.nextInt();

		rombo(numLineas);

		teclado.close();
	}

	/**
	 * Metodo que dibuja un parametro de tantas lineas como indiques en el parametro
	 * 
	 * @param dato
	 */
	private static void rombo(int dato) {

		int numLineas = dato / 2;
		int numLineas2 = dato % 2 == 1 ? numLineas + 1 : numLineas;
		int numAsteris = 1;

		// Mitad de arriba del rombo
		for (int i = 0; i < numLineas2; i++) {
			// Pinta los espacios en la linea antes de los asteriscos
			for (int numEspacios = numLineas2; numEspacios > i; numEspacios--) {
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
		numAsteris = dato % 2 == 1 ? numAsteris - 4 : numAsteris - 2;

		// Mitad de abajo del rombo
		for (int i = 0; i < numLineas; i++) {
			// Pinta los espacios en la linea antes de los asteriscos
			for (int numEspacios = dato % 2 == 1 ? -2 : -1; numEspacios < i; numEspacios++) {
				System.out.print(" ");
			}
			// Pinta los asteriscos en la linea
			for (int f = 0; f < numAsteris; f++) {
				System.out.print("*");
			}
			// Se le resta 2 a las variable de los asteriscos y pasa a la siguiente linea
			numAsteris = numAsteris - 2;
			System.out.print("\n");
		}
	}

}// class
