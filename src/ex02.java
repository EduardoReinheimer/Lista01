import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println(String.format("O n�mero informado foi [%s]", num));
			

	}

}
