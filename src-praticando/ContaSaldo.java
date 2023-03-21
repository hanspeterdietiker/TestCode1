import java.util.Scanner;

public class ContaSaldo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			int valor, saldo;
			int conta;
			char operacao;

			System.out.print("Informe numero da sua conta: ");
			conta = sc.nextInt();

			System.out.print("Informe seu saldo: ");
			saldo = sc.nextInt();

			System.out.print("Informe o valor da compra: ");
			valor = sc.nextInt();

			System.out.print("Informe a operacao da compra: \nDebito:  \nCredito:\n ");
			operacao = sc.next().charAt(0);

			int novoSaldo = operacao + (saldo - valor);

			if (novoSaldo > 1) {
				System.out.print("Conta positivada.");
			} else {
				System.out.print("CONTA ESTOURADA!");
			}

			System.out.print("\nQuer repetir a transacao? \n(1)Sim: \n(2)Nao:\n");
			x = sc.nextInt();

		} while (x == 1);
		sc.close();


	}
}
