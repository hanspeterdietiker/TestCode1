import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				 
	    System.out.println("Informe o valor da base:");
	    int base= sc.nextInt();
	    
	    System.out.println("informe valor da altura:" );
		int altura= sc.nextInt();
		
		int c = 2 ;
		
		int valor = (base*altura)/c;
		
		System.out.print("resultado = " +valor);
		
		sc.close();

			}
}
