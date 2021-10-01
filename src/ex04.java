import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = scan.nextDouble();
		scan.close();

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println(String.format("A média é %s", media));

	}

}
