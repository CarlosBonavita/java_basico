import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 1, numero = 0;

		numero = teclado.nextInt();
		while (contador <= 6) {
			if (numero % 2 == 0) {
				numero++;
			}
			System.out.println(numero);
			numero++;
			contador++;
		}
		teclado.close();
	}
}