import java.util.Scanner;

public class DomingoDePáscoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o ano: ");
		int ano = sc.nextInt();

		int A = (ano % 19);
		int B = (ano / 100);
		int C = (ano % 100);
		int D = (B / 4);
		int E = (B % 4);
		int F = (B + 8) / 25;
		int G = (B - F + 1) / 3;
		int H = (19 * A + B - D - G + 15) % 30;
		int I = (C / 4);
		int K = (C % 4);
		int L = (32 + 2 * E + 2 * I - H - K) % 7;
		int M = (A + 11 * H + 22 * L) / 451;
		int Mes = (H + L - 7 * M + 114) / 31;
		int Dia = (H + L - 7 * M + 114) % 31 + 1;

		System.out.print("Domingo de Pascoa: " + Dia + "/" + Mes + "/" + ano);

		sc.close();
	}
}
