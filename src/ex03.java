import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		scan.close();
		
		double soma = num1 + num2;
		
		System.out.println(
				String.format("A soma dos dois d�gitos �: %s", soma)
				);
		

	}

}
