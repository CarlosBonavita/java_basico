import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double distancia, litro, gasolina;

		distancia = teclado.nextDouble();
		litro = teclado.nextDouble();

		gasolina = distancia / litro;
		System.out.printf("%.3f km/l\n", gasolina);
		teclado.close();
	}
}

;