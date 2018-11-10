import java.util.Scanner;

public class CodificaPalabras {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce palabras.\n-0 para terminar-\n");
		String cadenaIntroducida = "";

		while (!cadenaIntroducida.endsWith(" 0\n") && !cadenaIntroducida.endsWith("\t0\n")
				&& !cadenaIntroducida.endsWith("\n0\n")) {

			cadenaIntroducida += teclado.nextLine() + "\n";
		}

		System.out.println(contarCaracteresPalabrasLineas(cadenaIntroducida));

		System.out.println("\nIntroduce el codigo que deseas traducir");
		String codigoDescifrar = teclado.nextLine();
		System.out.println("\nElige una opcion sobre que hacer con ese codigo: "
				+ "\n1 para el total de caracteres \n2 para el total de palabras " + "\n3 para el total de lineas");
		int opcion = Integer.parseInt(teclado.nextLine());

		System.out.println(interpretarCodigo(codigoDescifrar, opcion));

		teclado.close();
	}

	/**
	 * 
	 * @param informacionCodificada
	 * @param opcion
	 * @return Informacion descodificada
	 */
	public static String interpretarCodigo(String informacionCodificada, int opcion) {

		if (informacionCodificada.length() == 20 && opcion < 4 && opcion > 0) {

			int numCaracteres = Integer.parseInt(informacionCodificada.substring(0, 6)) - 50;
			int numPalabras = Integer.parseInt(informacionCodificada.substring(7, 13)) - 50;
			int numLineas = Integer.parseInt(informacionCodificada.substring(14, 20)) - 50;

			switch (opcion) {

			case 1:
				return "\nEl numero de caracteres es : " + String.valueOf(numCaracteres / 8);
			case 2:
				return "\nEl numero de palabras es : " + String.valueOf(numPalabras / 8);
			case 3:
				return "\nEl numero de lineas es : " + String.valueOf(numLineas / 8);
			}
		}
		return "\nCodigo o opcion invalida";
	}

	/**
	 * 
	 * @param cadenaCaracteres
	 * @return informacion codificada sobre la cadena de caracteres
	 */
	public static String contarCaracteresPalabrasLineas(String cadenaCaracteres) {

		String informacionCodificada = codificarNumero(contarCaracteres(cadenaCaracteres)) + "-"
				+ codificarNumero(contarPalabras(cadenaCaracteres)) + "-"
				+ codificarNumero(contarLineas(cadenaCaracteres));

		return informacionCodificada;
	}

	/**
	 * 
	 * @param cadenaCaracteres
	 * @return numero lineas
	 */
	public static int contarLineas(String cadenaCaracteres) {

		int numLineas = cadenaCaracteres.endsWith("\n0\n") ? -1 : 0;

		for (int i = 0; i < cadenaCaracteres.length(); i++) {

			if (cadenaCaracteres.charAt(i) == '\n') {

				numLineas++;
			}

		}

		return numLineas;
	}

	/**
	 * 
	 * @param cadenaCaracteres
	 * @return numero Caracteres
	 */
	public static int contarCaracteres(String cadenaCaracteres) {

		return cadenaCaracteres.length() - 3;
	}

	/**
	 * 
	 * @param cadenaCaracteres
	 * @return numero palabaras
	 */
	public static int contarPalabras(String cadenaCaracteres) {

		int numPalabras = 0;

		for (int i = 0; i < cadenaCaracteres.length() - 1; i++) {

			if (Character.isWhitespace(cadenaCaracteres.charAt(i))
					&& !Character.isWhitespace(cadenaCaracteres.charAt(i + 1))) {

				numPalabras++;
			}

		}

		return numPalabras;
	}

	/**
	 * 
	 * @param numero
	 * @return devuleve el numero codificado
	 */
	public static String codificarNumero(int numero) {

		numero = numero * 8;
		numero += +50;

		int auxNumero = numero;
		int numDigitos = 0;

		for (; auxNumero > 0; auxNumero /= 10) {
			numDigitos++;
		}
		String numeroCodificado = "";

		for (int i = 0; i < 6 - numDigitos; i++) {
			numeroCodificado += "0";
		}

		numeroCodificado += numero;

		return numeroCodificado;

	}

}// class
