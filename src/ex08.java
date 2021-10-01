import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quantos R$ voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Digite quantas horas voc� trabalha por m�s: ");
		double horasTrabalhadas = scan.nextDouble(); 
		scan.close();
		
		double salarioMensal = GetSalarioMensal(valorHora, horasTrabalhadas);

		System.out.println(String.format("O seu sal�rio mensal �: R$%s", salarioMensal));
	}

	private static double GetSalarioMensal(double valorHora, double horasTrabalhadas) {	
		return valorHora * horasTrabalhadas;
	}

}
