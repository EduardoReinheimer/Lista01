import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		scan.close();
		
		float pesoIdeal = GetPesoIdeal(altura);
		
		System.out.println(String.format("O seu peso ideal é: %.2fKg ", pesoIdeal));
	}

	private static float GetPesoIdeal(float altura) {
		return (altura * 72.7f) - 58f;
	}

}
