import java.util.Scanner;

/**
 * Programa calculador del salario de una persona segun las horas que trabaje
 * 
 * @author nacho 18.10.18
 */

public class CalcSalario {

	public static double calcularSalario(double horas) {

		double sueldo;
		if (horas <= 35) {
			sueldo = horas * 15;
		} else {
			sueldo = 35 * 15 + (horas - 35) * 22;
		}
		return sueldo;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String respuesta = "";

		do {
			System.out.println("Cuantas horas trabaja?");
			double horas = Double.parseDouble(teclado.nextLine());
			double sueldo = calcularSalario(horas);
			System.out.println("Cobra " + sueldo + " Euros");

			System.out.println("Desea volver a ralizar la operacion? S/n");
			respuesta = teclado.nextLine();
		} while (respuesta.toUpperCase().equals("S"));

		teclado.close();
	}
}
