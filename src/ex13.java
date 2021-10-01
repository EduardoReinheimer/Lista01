import java.util.Scanner;

public class ex13 {
	final static float PESO_REGULAMENTO = 50f;
	final static float MULTA_POR_QUILO = 4f;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o peso dos peixes em Kg: ");
		float pesoPeixes = input.nextFloat();
		input.close();

		float excessoPeso, multa;

		excessoPeso = GetExcesso(pesoPeixes);
		multa = GetValueMulta(excessoPeso);

		System.out.println(String.format("Peso Excedido: %s\nMulta : %s", excessoPeso == 0 ? "ZERO" : excessoPeso,
				multa == -1 ? "NEGATIVO" : multa));

	}

	private static float GetValueMulta(float excesso) {
		return excesso != 0f ? excesso * 4f : -1f;
	}

	private static float GetExcesso(float pesoPeixes) {
		return pesoPeixes > PESO_REGULAMENTO ? pesoPeixes - PESO_REGULAMENTO : 0f;

	}

}
