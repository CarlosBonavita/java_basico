import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1;
		double valor2;
		
				System.out.println("Digite o primeiro valor:");
		valor1 = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = teclado.nextDouble();
		System.out.println("Primeiro valor: " + valor1);
		System.out.println("Segundo valor: " + valor2);
	}
}