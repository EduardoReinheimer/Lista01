import java.util.Scanner;

public class ex14 {

	static final int IMPOSTO_RENDA = 11;
	static final int INSS = 8;
	static final int SINDICATO = 5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor da hora: ");
		float valorHora = input.nextFloat();
		System.out.print("Digite o número de horas trbalhadas: ");
		int horasTrabalhadas = input.nextInt();
		input.close();
		
		float salarioBruto = GetSalarioBruto(valorHora, horasTrabalhadas);
		float valorINSS = GetINSS(salarioBruto);
		float valorSindicato = GetSindicato(salarioBruto);
		float valorIR = GetIR(salarioBruto);
		float salarioLiquido = GetSalarioLiquido(salarioBruto, valorINSS, valorIR, valorSindicato);
		
		System.out.println(String.format("Salário Bruto: R$%.2f", salarioBruto));
		System.out.println(String.format("IR: R$%.2f", valorIR));
		System.out.println(String.format("INSS: R$%.2f", valorINSS));
		System.out.println(String.format("Sindicato: R$%.2f", valorSindicato));
		System.out.println(String.format("Salário Liquido: R$%.2f", salarioLiquido));

	}

	private static float GetSalarioLiquido(float salarioBruto, float valorINSS, float valorIR, float valorSindicato) {
		return salarioBruto - valorINSS - valorIR - valorSindicato;
	}

	private static float GetIR(float salarioBruto) {
		return GetPercentageFromValue(salarioBruto, IMPOSTO_RENDA);
	}

	private static float GetSindicato(float salarioBruto) {
		return GetPercentageFromValue(salarioBruto, SINDICATO);
	}

	private static float GetINSS(float salarioBruto) {
		return GetPercentageFromValue(salarioBruto, INSS);
	}

	private static float GetPercentageFromValue(float value, int percentage) {
		return (float)(value / 100) * percentage;
	}

	private static float GetSalarioBruto(float valorHora, int horasTrabalhadas) {
		return valorHora * horasTrabalhadas;
	}

}
