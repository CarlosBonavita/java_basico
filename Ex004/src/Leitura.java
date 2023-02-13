import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora;
		double desconto, salario, valorHora;

		System.out.println("Informe a quantidade de horas:");
		hora = teclado.nextInt();
		System.out.println("Informe o valor de cada hora:");
		valorHora = teclado.nextDouble();
		System.out.println("Informe o valor do desconto:");
		desconto = teclado.nextDouble();

		salario = hora * valorHora;
		System.out.println("Salário bruto: " + salario);

		salario = salario - (salario * desconto / 100);
		System.out.println("Salário Líquido: " + salario);

		teclado.close();
	}
}
