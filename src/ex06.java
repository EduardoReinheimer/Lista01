import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio do c�rculo: ");
		double raio = scan.nextDouble();
		scan.close();
		
		double areaCirculo = GetAreaCirculo(raio);

		System.out.println(String.format("A �rea do c�rculo �: %sm", areaCirculo));
	}

	private static double GetAreaCirculo(double raio) {
		return Math.PI *  Math.pow(raio, 2);
	}

}
