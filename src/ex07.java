import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.print("Digite a medida de um dos lados do quadrado: ");
		double lado = scan.nextDouble();
		scan.close();
		
		double areaQuadrado = GetAreaQuadrado(lado);

		System.out.println(String.format("A área do quadrado é %sm²", areaQuadrado));
	}

	private static double GetAreaQuadrado(double lado) {
		return lado * lado;
	}

}
