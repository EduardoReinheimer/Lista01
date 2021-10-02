import java.util.Scanner;

public class ex16 {

	static final float FATOR_CONVERSAO = (float) 1 / 6;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a área em m2: ");
		float area = input.nextFloat();
		input.close();

		int litros = GetLitros(area);

		int latas18 = GetQuantidadeLatas(litros, 18);
		int latas3_6 = GetQuantidadeLatas(litros, 3.6f);
		
		System.out.println("================================== Situação 1 ==================================");
		System.out.println(
				String.format("Latas necessárias 18L : %s\nPreço: R$%.2f", latas18, GetPreco(latas18, 80.00f)));
		System.out.println("================================== Situação 2 ==================================");
		System.out.println(
				String.format("Latas necessárias 3,6L : %s\nPreço: R$%.2f", latas3_6, GetPreco(latas3_6, 25.00f)));

	}

	private static float GetPreco(int qntLatas, float valorLata) {
		return qntLatas * valorLata;
	}

	private static int GetLitros(float area) {
		return (int) Math.ceil(area * FATOR_CONVERSAO);
	}

	private static int GetQuantidadeLatas(float litros, float litragemLata) {
		return (int) Math.ceil(litros / litragemLata);
	}

}
