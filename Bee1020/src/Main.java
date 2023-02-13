import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner teclado =  new Scanner(System.in);
int idade, ano, mes, dias;

idade = teclado.nextInt();

ano = idade / 365;
mes = idade % 365 / 30;
dias = idade % 365 % 30;

System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", ano, mes, dias);
teclado.close();
}
}