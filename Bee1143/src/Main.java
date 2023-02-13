import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			int r1 = i * i;
			int r2 = r1 * i;
			System.out.printf("%d, %d, %d\n", i, r1, r2);
		}
		teclado.close();
	}
}
