import java.util.ArrayList;
import java.util.Scanner;

public class Comprueba4Vocales {

	private static ArrayList<String> palabrasCon4Vocales = new ArrayList<String>();
	private static ArrayList<String> palabras = new ArrayList<String>();
	private static int numPalabras = 0;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String grupoPalabras = pideDatos();

		separarPalabras(grupoPalabras);

		palabrasCuatroVocales();

		System.out.println("\n - Las palabras introducidas que tienen 4 vocales son : - \n");

		for (int i = 0; i < palabrasCon4Vocales.size(); i++) {

			System.out.println(palabrasCon4Vocales.get(i));

		}

	}

	private static void palabrasCuatroVocales() {

		for (int i = 0; i < numPalabras; i++) {

			int numVocales = 0;

			for (int j = 0; j < palabras.get(i).length(); j++) {

				if (palabras.get(i).charAt(j) == 'a' || palabras.get(i).charAt(j) == 'e'
						|| palabras.get(i).charAt(j) == 'i' || palabras.get(i).charAt(j) == 'o'
						|| palabras.get(i).charAt(j) == 'u') {

					numVocales++;
				}

			}
			if (numVocales >= 4) {

				palabrasCon4Vocales.add(palabras.get(i));
			}
		}

	}

	private static void separarPalabras(String grupoPalabras) {

		String palabra = "";

		for (int i = 0; i < grupoPalabras.length(); i++) {

			palabra += grupoPalabras.charAt(i);

			if (grupoPalabras.charAt(i) == ' ' || grupoPalabras.charAt(i) == '\t' || grupoPalabras.charAt(i) == '\n') {

				palabras.add(numPalabras, palabra);

				numPalabras++;
				palabra = "";
			}
		}
	}

	private static String pideDatos() {

		System.out.println("Introduce las palabras que quieras \n" + "- Introduce 0 para dejar de introducir");

		String grupoPalabras = "";

		while (!grupoPalabras.endsWith("0 ")) {
			grupoPalabras += teclado.nextLine() + " ";
		}

		return grupoPalabras;
	}

}// class
