import java.util.Scanner;

public class AlgoritmoDaCaneta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor repassado pelo cliente: ");
		double Z = sc.nextDouble();

		System.out.print("Valor de 30 unidades de canetas: ");
		double Y = sc.nextDouble();

		System.out.print("Quantidade de canetas iguais: ");
		double N = sc.nextDouble();

		if (Z > Y)
			if (N > 0)
				if (Y >= 0)
					if (Z > 0) {
					}

		double resultadoFinal = (Z - Y) / N;

		System.out.println("Mostrando valor por unidade de cada caneta:R$" + resultadoFinal);

		if (resultadoFinal <= 0) {
			System.out.println("Erro: os valores sao insconsistentes!");
		}

		sc.close();
	}

}
