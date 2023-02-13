import java.util.Scanner;

public class Leitura {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	int distancia, tempo, velocidade;
	double consumo;

	System.out.println("Informe a velocidade do veículo:");
	velocidade = teclado.nextInt();
	System.out.println("Informe o tempo da viagem:");
	tempo = teclado.nextInt();
	distancia = velocidade * tempo;
	consumo = distancia / 12;
	System.out.println("Consumo da gasolina: " + consumo);
teclado.close();
}
}
