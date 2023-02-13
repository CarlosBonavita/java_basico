import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codigo1, quantidade1, codigo2, quantidade2;
		double total, valor1, valor2;

		codigo1 = teclado.nextInt();
		quantidade1 = teclado.nextInt();
		valor1 = teclado.nextDouble();
		codigo2 = teclado.nextInt();
		quantidade2 = teclado.nextInt();
		valor2 = teclado.nextDouble();

		total = quantidade1 * valor1 + quantidade2 * valor2;

		System.out.printf(" VALOR A PAGAR: R$ = %.2f\n", total);
		teclado.close();
	}
}
