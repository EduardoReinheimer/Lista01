import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();

		System.out.print("Digite seu sexo: ");
		char sexo = scan.next().charAt(0);
		
		scan.close();
		
		float pesoIdeal = 0;
		if(sexo == 'm' || sexo == 'M') {
			pesoIdeal = GetPesoIdealHomem(altura);
		} else if (sexo == 'f' || sexo == 'F') {
			pesoIdeal = GetPesoIdealMulher(altura);
		}
		
		System.out.println(String.format("O seu peso ideal é: %.2fKg", pesoIdeal));

	}

	private static float GetPesoIdealMulher(float altura) {
		return (altura * 62.1f) - 44.7f;
	}

	private static float GetPesoIdealHomem(float altura) {
		return (altura * 72.7f) - 58;
	}

}
