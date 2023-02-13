import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int par = 0;

		for (int contador = 1; contador <= 5; contador++) {
			int numero = teclado.nextInt();
			if (numero % 2 == 0) {
				par++;
			}
		}
		System.out.printf("%d valores pares\n", par);
		teclado.close();
	}
}
