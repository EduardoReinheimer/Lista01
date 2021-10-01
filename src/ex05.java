import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor em metros: ");
		double valorMetros = scan.nextDouble();
		scan.close();
		
		double valorCentimetros = ConverteMetrosParaCentimetros(valorMetros);
		
		System.out.println(String.format("%sM = %scm", valorMetros, valorCentimetros));
	}

	private static double ConverteMetrosParaCentimetros(double valorMetros) {
		return valorMetros * 100;
	}

}
