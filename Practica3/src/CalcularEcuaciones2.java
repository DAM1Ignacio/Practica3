import java.util.Scanner;

public class CalcularEcuaciones2 {
	
	public static String resultado;
	
	public static void main (String [] Args) {
		Scanner teclado = new Scanner(System.in);

		// pide datos
		System.out.println("Introduce el valor de a");
		int a = teclado.nextInt();
		System.out.println("Introduce el valor de b");
		int b = teclado.nextInt();
		System.out.println("Introduce el valor de c");
		int c = teclado.nextInt();
		teclado.close();
		
		evaluarDiscriminante(a,b,c);
		
		System.out.println(resultado);
	}
	
	public static void evaluarDiscriminante(int a, int b, int c){
		

		double resx1 = 0;
		double resx2 = 0;
		
		// Resultados datos excepcionales
		if (a == 0 & b == 0) {
			System.out.println("Los valores introducidos hacen que la ecuacion sea degenerada");
		} else if (a == 0 & b != 0) {
			resx1 = (-b + -c / b) / 2 * a;
			resx2 = resx1;
		} else { // Calcula ecuacion
			resx1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			resx2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		}

		
		resultado = "En la ecuacion " + a + "x^2 + " + b + "x + " + c + " = 0\n" + "El resultado seria : \n"
		+ "x1 = " + resx1 + "\nx2 = " + resx2;
	}
}
