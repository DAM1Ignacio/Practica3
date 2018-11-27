import java.util.Scanner;

/**
 * Devuelve el valor de un numero en la sucesion de fibonacci
 * 
 * @author nacho
 *
 */
public class ValorEnFibonacci {

	static final int LIMITE_SUPERIOR = 76;
	static final int LIMITE_INFERIOR = 0;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce datos");
		System.out.println(fibonacciA(teclado.nextInt()));

		teclado.close();
	}

	private static int fibonacciA(int num) {

		assert num > LIMITE_INFERIOR || num < LIMITE_SUPERIOR : "Error";

		// Variables algoritmo fibonacci
		int primerValor = 1;
		int segundoValor = 2;
		int resultado = num == 2 ? 2 : 1;

		// Algoritmo fibonacci
		for (int i = 2; i < num; i++) {

			resultado = primerValor + segundoValor;
			primerValor = segundoValor;
			segundoValor = resultado;
		}

		return resultado;

	}

}
