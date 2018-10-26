import java.util.Scanner;

/**
 * Programa que calcula el factorial de un numero
 * 
 * @author nacho
 *
 */
public class CalcFactorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el numero del que quieres calcular el factorial");

		int num = teclado.nextInt();
		int resultado = calculoFactorial(num);

		System.out.println("El factorial de " + num + " es " + resultado);

		teclado.close();
	}
	
	/**
	 * 
	 * @param num es el numero del que queremos calcular el factorial
	 * @return nos devuleve el factorial del parametro
	 */
	private static int calculoFactorial(int num) {

		int result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
