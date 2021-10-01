import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor de primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o valor de segundo número: ");
		double num2 = scan.nextDouble();
		scan.close();

		double a = GetA(num1, num2);
		double b = GetB(num1, a);
		double c = GetC(a);
		
		System.out.println(String.format("a = %s\nb = %s\nc = %s", a, b, c));

	}

	private static double GetC(double a) {
		return Math.pow(a,  3);
	}

	private static double GetB(double num1, double a) {
		return (num1 * 3) + a;
	}

	private static double GetA(double num1, double num2) {
		return (num1 * 2) * (num2 / 2);
	}

}
