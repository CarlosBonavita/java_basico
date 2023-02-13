import java.util.Scanner;

public class Luz {
public static void main(String args[]) {
Scanner teclado = new Scanner(System.in);

Double salario, kw, conta, desconto, unidade;

System.out.println("Informe o valor do salário:");
salario = teclado.nextDouble();

System.out.println("Informe a quantidade de KW:");
kw = teclado.nextDouble();

unidade = salario / 7 / 100;
conta = kw * unidade;
desconto = conta - (conta * 10 / 100);

System.out.println("Valor em reais de cada KW: " + unidade);
System.out.println("Valor em reais a ser pago: " + conta);
System.out.println("Novo valor com desconto de 10 porcento: " + desconto);
}
}
