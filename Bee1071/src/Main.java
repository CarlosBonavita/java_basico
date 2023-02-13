import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x = 0, y = 0, min = 0, max = 0, total = 0;

		x = teclado.nextInt();
		y = teclado.nextInt();

		if (x > y) {
			min = y;
			max = x;
		} else {
			min = x;
			max = y;
		}

		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				total += i;
			}
		}
		System.out.println(total);
		teclado.close();
	}
}