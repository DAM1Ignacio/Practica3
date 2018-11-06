import java.util.Scanner;

public class ValorEnFibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(fibonacciA(teclado.nextInt()));
		
		teclado.close();
		
	}
	private static int fibonacciA(int num) {

		assert num >= 0;
		
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
