import java.util.Scanner;

/**
 * Programa que muestra que tipo de triangulo es
 * 
 * @author nacho 09/11/18
 */
public class CalculaTriangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir datos
		System.out.println("Introduce el lado a del triangulo");
		double a = teclado.nextDouble();
		System.out.println("Introduce el lado b del triangulo");
		double b = teclado.nextDouble();
		System.out.println("Introduce el lado c del triangulo");
		double c = teclado.nextDouble();

		System.out.println(tipoTriangulo(a, b, c));

		teclado.close();
	}

	public static String tipoTriangulo(double a, double b, double c) {

		if (!esTriangulo(a, b, c)) {

			return "Error";
		}
		// Es triangulo, se evalua de que tipo es
		if (a == b && a == c) {

			return "Equilatero";
		} else if (a == b || a == c || b == c) {

			return "Isósceles";
		} else {

			return "Escaleno";
		}
	}

	public static boolean esTriangulo(double a, double b, double c) {

		if (a + b < c || a + c < b || b + c < a) {

			return false;
		}
		return true;
	}

}// class
