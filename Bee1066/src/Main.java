import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0, par = 0, impar = 0, positivo = 0, negativo = 0;

		for (int contador = 1; contador <= 5; contador++) {
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				par++;
			}
			if (numero % 2 > 0) {
				impar++;
			}
			if (numero >= 0) {
				positivo++;
			}
			if (numero < 0) {
				negativo++;
			}
		}
		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", impar);
		System.out.printf("%d valor(es) positivo(s)\n", positivo);
		System.out.printf("%d valor(es) negativo(s)\n", negativo);
		teclado.close();
	}
}
