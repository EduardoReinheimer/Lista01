import java.util.Scanner;

public class ex14 {

	static final int IMPOSTO_RENDA = 11;
	static final int INSS = 8;
	static final int SINDICATO = 5;
	
	public static void main(String[] args) {
		//14.Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
		//trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se
		//que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
		//sindicato, fa�a um programa que nos d�:
		//a. sal�rio bruto.
		//b. quanto pagou ao INSS.
		//c. quanto pagou ao sindicato.
		//d. o sal�rio l�quido.
		//e. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		//f. + Sal�rio Bruto : R$
		//g. - IR (11%) : R$
		//h. - INSS (8%) : R$
		//i. - Sindicato ( 5%) : R$
		//j. = Sal�rio Liquido : R$
		//Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da hora: ");
		float valorHora = input.nextFloat();
		System.out.print("Digite o n�mero de horas trbalhadas: ");
		float horasTrabalhadas = input.nextFloat();
		
		
		

	}

}
