import java.util.Scanner;

/**
 * Programa para comprobar si un numero es de la sucesion de fibonacci
 * 
 * @author nacho
 *
 */
public class Fibonacci {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero del valor en la sucesion de fibonacci que quieres saber");
		int num = teclado.nextInt();

		if (num >= 0) {
			int resultado = valorFibonacci(num);
			System.out.println("El valor " + num + " en la sucesion de fibonacci es " + resultado);
		}else {
			System.out.println(num+" no es un numero entero"); 
		}
		teclado.close();
	}

	/**
	 * 
	 * @param num se introduce el numero a comprobar
	 * @return devuelve true si es un numero de fibonacci
	 */
	private static int valorFibonacci(int num) {

		// Variables algoritmo fibonacci
		int primerValor = 1;
		int segundoValor = 1;
		int resultado = num == 0 ? 0 : 1;

		// Algoritmo fibonacci
		for (int i = 2; i < num; i++) {
			resultado = primerValor + segundoValor;
			primerValor = segundoValor;
			segundoValor = resultado;

		}
		return resultado;
	}
}
