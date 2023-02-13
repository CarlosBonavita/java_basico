import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		numero = teclado.nextInt();
		for (int contador = 0; contador >= numero; contador++) {
			if (contador % 2 > 0) {
				System.out.println(contador);
			}
		}
		teclado.close();
	}
}
