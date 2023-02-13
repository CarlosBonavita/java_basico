import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				int r = i * i;
				System.out.printf("%d^2 = %d\n", i, r);
			}
		}
		teclado.close();
	}
}
