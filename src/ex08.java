import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quantos R$ você ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Digite quantas horas você trabalha por mês: ");
		double horasTrabalhadas = scan.nextDouble(); 
		scan.close();
		
		double salarioMensal = GetSalarioMensal(valorHora, horasTrabalhadas);

		System.out.println(String.format("O seu salário mensal é: R$%s", salarioMensal));
	}

	private static double GetSalarioMensal(double valorHora, double horasTrabalhadas) {	
		return valorHora * horasTrabalhadas;
	}

}
