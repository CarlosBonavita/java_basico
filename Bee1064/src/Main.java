import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero = 0, media = 0;
		int  quantidadePositivos = 0;

		for (int contador = 1; contador <= 6; contador++) {
			System.out.println("Digite um número:");
			numero = teclado.nextDouble();
			if (numero > 0) {
				quantidadePositivos++;
				media += numero;
			}
		}
		media = media / quantidadePositivos;
		System.out.println("Total de números positivos: " + quantidadePositivos);
		System.out.printf("mEDIA = %.1f", media);
		teclado.close();
	}
}
