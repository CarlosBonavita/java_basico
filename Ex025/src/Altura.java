
public class Altura {
	public static void main(String[] args) {

		int ano = 0, chico = 150, ze = 110;

		while (ze <= chico) {
			chico += 2;
			ze += 3;
			ano++;
		}
		System.out.println("Em " + ano + " anos, Zé estará com " + ze + " e Chico com " + chico + ".");

	}
}
