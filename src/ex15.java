import java.util.Scanner;

public class ex15 {
	static final float FATOR_CONVERSAO = (float)1/3;
	static final float PRECO_LATA = 80.00f;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a área em m2: ");
		float area = input.nextFloat();
		input.close();
		
		int latas = GetQuantidadeLatas(area);
		float preco = GetPreco(latas);
			
		System.out.println(String.format("Latas necessárias : %s\nPreço: R$%.2f", latas, preco));

	}

	private static float GetPreco(int latas) {
		return PRECO_LATA * latas;
	}

	private static int GetQuantidadeLatas(float area) {
		return (int)Math.ceil(Math.ceil(area * FATOR_CONVERSAO) /18);
	}



}
