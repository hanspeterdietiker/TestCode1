import java.util.Scanner;

public class MoedaFalsa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor da pesagem do Grupo 1: ");
		int gp1 = sc.nextInt();
		// GRUPO 1 É AS MOEDAS 1 E 2.

		System.out.print("Informe o valor da pesagem do Grupo 2: ");
		int gp2 = sc.nextInt();
		// GRUPO 2 É AS MOEDAS 3 E 4.

		System.out.print("Informe o valor da pesagem da Moeda 5: ");
		int gp3 = sc.nextInt();
		// GRUPO 3 É APENAS A MOEDA 5.

		if (gp1 == gp2)
			System.out.print("Correto! Grupo 1 e Grupo 2 carregam as moedas certas. ");
		else
			System.out.print("Erro! tem algo de errado.");

		sc.close();
	}
}