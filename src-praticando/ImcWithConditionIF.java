import java.util.Scanner;

public class ImcWithConditionIF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu Peso: ");
		float peso = sc.nextFloat();

		System.out.print("Informe sua Altura ");
		float altura = sc.nextFloat();

		float imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.print("Abaixo do peso.");

		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.print("Peso normal.");

		} else if (imc > 25 && imc == 29.9) {
			System.out.print("Acima do peso.");

		} else {
			System.out.print("Obeso.");

		}
		System.out.print("\nSeu IMC: " + imc);
		sc.close();
	}

}
